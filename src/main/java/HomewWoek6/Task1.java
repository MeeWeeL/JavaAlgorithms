package HomewWoek6;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Task1 {

    static int countOfNums = 30;
    public static void main(String[] args) {

//        Tree<Integer> tree = new TreeImpl<>();
        Tree[] trees = new Tree[countOfNums];
        fillTrees(trees);
        displayAll(trees);
//        for (int i = 0; i < trees.length; i++) {
//            System.out.println(trees[i].isBalanced());
//        }

//        tree.add(60);
//        tree.add(50);
//        tree.add(66);
//        tree.add(40);
//        tree.add(55);
//        tree.add(70);
//        tree.add(31);
//        tree.add(45);
//        tree.add(42);
//        tree.add(43);
//        tree.add(69);
//        tree.add(67);
//        tree.add(68);
//        trees[0].add(81);

//        trees[0].display();

//        tree.remove(68);
//        tree.remove(69);
//        tree.remove(42);
//        tree.remove(70);
//        tree.remove(40);

//        tree.display();

//        tree.traverse(Tree.TraversMode.IN_ORDER);
//        tree.traverse(Tree.TraversMode.PRE_ORDER);
//        tree.traverse(Tree.TraversMode.POST_ORDER);

    }

    private static void displayAll(Tree[] trees) {
        for (int i = 0; i < trees.length; i++) {
            trees[i].display();
        }
    }

    static void fillTrees(Tree<Integer>[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new TreeImpl();
            fillTree(arr[i]);
        }
    }

    static void fillTree(Tree<Integer> tree) {
        int[] ints = new int[countOfNums];
        for (int i = 0; i < ints.length; i++) {
            int a;
            do {
                a = (int) (Math.random() * 26);
                if (Math.random() * 100 > 50) a = -a;
            } while (isHas(a, ints));
            ints[i] = a;
            tree.add(ints[i]);
        }
    }

    static boolean isHas(int a, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (a == ints[i]) return true;
        }
        return false;
    }
}
