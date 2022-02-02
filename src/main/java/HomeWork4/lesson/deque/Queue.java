package HomeWork4.lesson.deque;

public interface Queue<E> {

    boolean insert(E value);

    E remove(E value);

    E peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();

}
