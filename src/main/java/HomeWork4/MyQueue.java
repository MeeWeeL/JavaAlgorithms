package HomeWork4;

import HomeWork4.lesson.deque.Queue;

public class MyQueue<E> implements Queue<E> {

    private final MyTwoSideLinkedList<E> data;

    public MyQueue() {
        this.data = new MyTwoSideLinkedListImpl<>();
    }


    @Override
    public boolean insert(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E remove(E value) {
        return null;
    }

    @Override
    public E peekFront() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "LinkedQueue{" + "data = " + data + '}';
    }
}
