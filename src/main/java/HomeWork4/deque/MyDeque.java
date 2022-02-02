package HomeWork4.deque;

import HomeWork4.lesson.deque.Deque;

public class MyDeque<E> implements Deque<E> {

    private final MyLinkedListForDeque<E> data;

    public MyDeque() {
        this.data = new MyLinkedListForDequeImpl<>();
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        return data.removeLast();
    }

    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove(E value) {
        return data.removeFirst();
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
    public void displayBack() {
        data.displayBack();
    }
}
