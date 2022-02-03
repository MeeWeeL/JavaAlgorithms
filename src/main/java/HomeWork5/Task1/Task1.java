package HomeWork5.Task1;

public class Task1 {
    static int number = 2;
    static int pointer = -2;  // number ^ pointer

    public static void main(String[] args) {
        System.out.println(calculate(number, pointer));
    }

    static float calculate(int num, int point) {
        float answer = 0;
        if (point < 0) {
            answer = 1 / calt(num, -point);
        }

        if (point == 0) {
            answer = 1; // 5^0=1; 0^0=1; -3^0=1;
        }

        if (point > 0) {
            answer = calt(num, point);
        }

        return answer;
    }

    static float calt(int num, int point) {
        if (point == 0) {
            return 1;
        }
        return calt(num, point - 1) * num;
    }
}
