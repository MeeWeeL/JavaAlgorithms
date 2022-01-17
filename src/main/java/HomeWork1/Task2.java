package HomeWork1;


import java.sql.Array;

class Task2 {
    //-. Поиск элемента массива с известным индексом
    public static int searchItemOfArray(int[] arr, int index) {
        return arr[index];
    }   // O(1) константа



    //-. Дублирование одномерного массива через foreach
    public static int[] duplicateArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { // Я пробовал через foreach, но у меня получались только глупости,
            arr2[i] = arr[i];                  // поэтому сделал через for
        }
        return arr2;
    }   // f(n) = O(n) линейный рост


    //-. Удаление элемента массива с известным индексом без сдвига
    public static void deleteItemOfArray(String[] arr, int index) {
        arr[index] = null;
    }   // O(1) константа

    //-. Удаление элемента массива с неизвестным индексом без сдвига
    public static void deleteUnknownItemOfArray(String[] arr, String word) {
        for (String item : arr) {
            if (item == word) {
                item = null;
                break;
            }
        }
    }   //  f(n) = O(n) линейный рост

    //-. Удаление элемента массива с неизвестным индексом со сдвига
    public static void deleteUnknownItemOfArrayWithMove(String[] arr, String word) {
        for (int i = 0; i < arr.length; i++) { // f(n) = O(n) линейный рост
            if (arr[i] == word) {
                for (int j = i; j < arr.length - 1; j++) { // f(n) = O(n) линейный рост
                    arr[j] = arr[j+1];
                }
                arr[arr.length - 1] = null;
                break;
            }
        }
    }   // f(n) = O(n) линейный рост
}
