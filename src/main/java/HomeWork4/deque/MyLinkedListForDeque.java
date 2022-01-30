package HomeWork4.deque;

import HomeWork4.MyLinkedList;

public interface MyLinkedListForDeque<E> {

    void insertFirst(E value);
    void insertLast(E value);

    E getFirst();
    E getLast();

    E removeFirst();
    E removeLast();

    boolean remove(E value);

    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();
    void displayBack();

    class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> prev, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
}
