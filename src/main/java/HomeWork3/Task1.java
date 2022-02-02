package HomeWork3;

import java.util.Arrays;

public class Task1 {

    static int n = 50000;

    static int[] array = ArrayCreator.getArray(n);

    public static void main(String[] args) {
        print(Arrays.toString(array));
        print(Integer.toString(BinarySearch.search(array)));
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
