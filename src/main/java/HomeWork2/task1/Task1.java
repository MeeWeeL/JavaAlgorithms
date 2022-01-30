package HomeWork2.task1;

public class Task1 {
    static long time;
    static int pcs = 50000;
    public static Notebook[] notebooks = new Notebook[pcs];

    public static void main(String[] args) {
        time = System.currentTimeMillis();

        fill();
//        show();
        notebooks = Sort.sortByBrand(notebooks); // Взял бренд как во поразрядной сортировке за первый разряд
//        show();
        printTime(); // 18,22,19 millis. В первой сортировке я бы стринги поменял на инты или вообще енум, чтобы ускорить, но лень...
        notebooks = Sort.sortByRAM(notebooks); // Соответственно второй разряд
//        show();
        printTime(); // 5,3,4 millis
        notebooks = Sort.sortByCost(notebooks); // Третий разряд
//        show();
        printTime(); // 7,7,7 millis
    }

    private static void show() {
        for (int i = 0; i < notebooks.length; i++) {
            print(notebooks[i].cost + "$, RAM " + notebooks[i].ram + "gb, " + notebooks[i].brand);
        }
    }
    private static void fill() {
        for (int i = 0; i < notebooks.length; i++) {
            notebooks[i] = new Notebook();
        }
    }
    private static void print(String text) {
        System.out.println(text);
    }
    private static void printTime() {
        print(Integer.toString((int)(System.currentTimeMillis() - time)) + " Millis");
        time = System.currentTimeMillis();
    }
}
