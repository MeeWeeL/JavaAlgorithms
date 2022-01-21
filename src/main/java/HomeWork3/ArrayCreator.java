package HomeWork3;

public class ArrayCreator {

    public static int[] getArray(int quantity) {
        int[] arr = new int[quantity];
        int indexOfWrongNumber = (int) (Math.random() * quantity);
        for (int i = 0; i < quantity; i++) {
            if (i < indexOfWrongNumber) arr[i] = i + 1;
            else arr[i] = i + 2;
        }
        return arr;
    }
}
