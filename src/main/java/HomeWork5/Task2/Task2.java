package HomeWork5.Task2;

import java.lang.reflect.Array;
import java.util.Objects;

public class Task2 {

    static int[][] things = {{3, 1},{4, 6},{5, 4},{8, 7},{9, 6},{2, 6}};
    static int[][] oldThings;
    static int[][] unusedThings;
    static int maxWeight = 13;
    static int count = things.length;
    static float[] po = getAllPo();

    public static void main(String[] args) {



        sortByPo();
        oldThings = things;
        int[][] bestSet = getBest(things, null); // Это получился метод наибольшей плотности и теперь надо посмотреть, будет ли выгоднее заменить элемент плотности элементами стоимости
        print(bestSet);
        int unusedCount = 0;
        for (int i = 0; i < bestSet.length; i++) {
            if (bestSet[i][0] == 0) {
                unusedCount += 1;
            }
        }
        System.out.println(unusedCount);
        unusedThings = new int[unusedCount][2];
        for (int i = 0; i < unusedThings.length; i++) {
            unusedThings[i][0] = 0;
        }
            for (int j = 0; j < bestSet.length; j++) {
                if (bestSet[j][0] != 0){
                    for (int z = 0; z < things.length; z++) {
                        if (Objects.equals(things[z], bestSet[j])) {

                            things[z] = null;
                            break;
                        }
                    }
                }
            }

        for (int i = 0; i < unusedThings.length; i++) {
                    for (int z = 0; z < things.length; z++) {
                        if (things[z] != null) {
                            unusedThings[i] = things[z];
                            things[z] = null;
                            break;
                        }
                    }
        }
        print(unusedThings);

//        bestSet = getBestBest(bestSet, unusedThings);

//        print(bestSet);
    }

    static int[][] getBestBest(int[][] best, int[][] unused) {
        int[][] newBest = best;
        return newBest;
    }

    static int bestPrice(int[][] a) {
        int price = 0;
        for (int i = 0; i < a.length; i++) {
            price += a[i][1];
        }
        return price;
    }
    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Weight: " + a[i][0] + "; Price: " + a[i][1]);
        }
    }
    static int[][] getBest(int[][] thingsArr, int[][] oldBest) {
        int[][] best;
        if (oldBest == null ) {
            best = new int[count][2];
            for (int i = 0; i < best.length; i++) {
                best[i] = new int[2];
                best[i][0] = 0;
            }
        }
        else best = oldBest;

        int weig = 0;
        for (int i = 0; i < best.length; i++) {
            if (best[i] != null) {
                weig += best[i][0];
            }
        }
        int[][] workArr = new int[count][2];
        for (int i = 0; i < thingsArr.length; i++) {
            workArr[i] = thingsArr[i];
        }
//
        int mW = minW(workArr);
//
        for (int i = 0; i < best.length; i++) {
            if (best[i][0] == 0) {
                for (int j = 0; j < workArr.length; j++) {
                    if (workArr[j] != null && workArr[j][0] < maxWeight - weig) {
                        best[i] = workArr[j];
                        weig += workArr[j][0];
                        workArr[j] = null;
                        break;
                    }
                }
                break;
            }
        }
        mW = minW(workArr);
        if (mW != 0 && maxWeight - weig > mW) {
            best = getBest(workArr, best);
        }
        return best;
    }

    static int minW(int[][] arr) {
        int minW = 0;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] != null) {
                minW = arr[i][0];
                break;
            }
        }
        for (int i =0; i < arr.length; i++) {
            if (arr[i] != null && arr[i][0] < minW) {
                minW = arr[i][0];
            }
        }
        return minW;
    }


    static void sortByPo() {
        for (int j = 0; j < things.length; j++){
            for (int i = 0; i < things.length - 1; i++) {
                if (gPo(things[i]) < gPo(things[i + 1])) {
                    int[] u = {things[i][0], things[i][1]};
                    things[i] = things[i + 1];
                    things[i + 1] = u;
                }
            }
        }
    }


    static int getHigherPrice() {
        int higherPrice = things[0][1];
        for (int i = 1; i < things.length; i++) {
            if (higherPrice < things[i][1]) higherPrice = things[i][1];
        }
        return higherPrice;
    }

    static float[] getAllPo() {
        float[] po = new float[things.length];
        for (int i = 0; i < things.length; i++) {
            po[i] = getPo(things[i][1], things[i][0]);
        }
        return po;
    }

    static float getBestPo(float[] pos) {
        float po = pos[0];
        for (int i = 1; i < pos.length; i++) {
            if (po < pos[i]) po = pos[i];
        }
        return po;
    }

    static float getPo(int w, int p) {
        return p / w;
    }

    static float gPo(int[] t) {
        return t[1] / t[0];
    }
}
