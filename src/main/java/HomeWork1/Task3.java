package HomeWork1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    // ###3. Определить сложность следующих алгоритмов. Сколько произойдет итераций?
    // a)
    public static void a() {
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);
            }
        }
    }   // O(log(n)*n) - квазилинейный рост

    // b)
    public static void b() {
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i += 2) {
            for (int j = i; j < n; j++) {
                arrayList.add(i * j);
            }
        }
    }   // O((n/2)*n) - Квадратичная сложность

    //с)
    public static void c() {
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
                n--;
            }
        }
    }   // Тут будет ровно n итераций, значит линейная сложность f(n) = O(n)

    // d)
    public static void d() {
        factorial(BigInteger.valueOf(10000));
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return n;
        }
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }   // f(n) = O(n), типичный факториал рекурсией

    // e)
    public static void e() {
        fib(BigInteger.valueOf(50));
    }

    public static BigInteger fib(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return n;
        }
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
    }
}   // f(n) = O(2^n), числа Фибоначчи с конца, экспоненциальная сложность
