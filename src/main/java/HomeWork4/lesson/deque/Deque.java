package HomeWork4.lesson.deque;



public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    void displayBack();

    E removeLeft();
    E removeRight();
}