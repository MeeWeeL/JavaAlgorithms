package HomeWork4.deque;

import java.util.Iterator;

public class MyLinkedListForDequeImpl<E> implements MyLinkedListForDeque<E>, Iterable<E> {

    protected int size;
    protected Node<E> first;
    protected Node<E> last;

    @Override
    public void insertFirst(E value) {
        first = new Node<>(value, null, first);
        size++;
        if (size == 1) {
            last = first;
        }
        if (size > 1) {
            first.next.prev = first;
        }
    }

    @Override
    public void insertLast(E value) {
        last = new Node<>(value, last, null);
        size++;
        if (size == 1) {
            first = last;
        }
        if (size > 1) {
            last.prev.next = last;
        }
    }

    @Override
    public E getFirst() {
        if (first != null) {
            return first.item;
        }
        return null;
    }

    @Override
    public E getLast() {
        if (last != null) {
            return last.item;
        }
        return null;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Node<E> removedItem = first;
            first = first.next;
            first.prev = null;
            removedItem.next = null;
            size--;
            return removedItem.item;
        }
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            Node<E> removedItem = last;
            last = last.prev;
            last.next = null;
            removedItem.prev = null;
            size--;
            return removedItem.item;
        }
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = first;
        Node<E> prev = null;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }
        if (current == first) {
            removeFirst();
            return true;
        }
        if (current == last) {
            removeLast();
            return true;
        }

        current.next.prev = prev;
        prev.next = current.next;
        current.next = null;
        current.prev = null;
        size--;

        return true;
    }

    @Override
    public boolean contains(E value) {
        Node<E> current = first;

        while (current != null) {
            if (current.item.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.append(" ]").toString();
    }

    @Override
    public void displayBack() {
        System.out.println(this.toStringBack());
    }

    public String toStringBack() {
        StringBuilder sb = new StringBuilder("[ ");
        Node<E> current = last;
        while (current != null) {
            sb.append(current.item);
            if (current.prev != null) {
                sb.append(" -> ");
            }
            current = current.prev;
        }
        return sb.append(" ]").toString();
    }

    public Node<E> getFirstForItr() {
        return first;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(this);
    }

    private class MyIterator<E> implements Iterator<E> {
        Node<E> currentNode;
        E next;
        E current;
        MyLinkedListForDequeImpl<E> link;

        public MyIterator(MyLinkedListForDequeImpl<E> thelink) {
            link = thelink;
            currentNode = link.getFirstForItr();
            current = link.getFirst();
            if (current != null) {
                next = currentNode.next.item;
            }
        }

        @Override
        public boolean hasNext() {
            if (current != null) {
                return next != null;
            }
            return false;
        }

        @Override
        public E next() {
            current = next;
            currentNode = currentNode.next;
            if (currentNode.next != null) {
                next = currentNode.next.item;
            } else {
                next = null;
            }
            return currentNode.item;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

//        @Override
//        public void forEachRemaining(Consumer<? super E> action) {
//            Iterator.super.forEachRemaining(action);
//        }
    }
}
