package HomeWork6;

public interface Tree<E extends Comparable<? super E>> {

    enum TraversMode {
        IN_ORDER, PRE_ORDER, POST_ORDER
    }

    boolean contains(E value);

    boolean add(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void display();

    void traverse(Tree.TraversMode mode);

    boolean isBalanced();

    boolean isBalanced(Node node);

    int height(Node node);
}