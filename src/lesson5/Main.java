package lesson5;

import java.util.Arrays;

public class Main {

    static final int size = 10000000;
    static final int halfSize = size / 2;

    public static void main(String[] args) {
        oneArr();

        try {
            twoArr();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void oneArr() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);

        long startTime = System.currentTimeMillis();
        calcNewVal(arr);
        long finishTime = System.currentTimeMillis();

        System.out.printf("time in oneArr func: %d ms%n", finishTime - startTime);
    }

    private static void twoArr() throws InterruptedException {
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);

        long startTime = System.currentTimeMillis();

        float[] firstPart = new float[halfSize];
        float[] secondPart = new float[halfSize];
        for (int i = 0, j = halfSize; i < halfSize; i++, j++) {
            firstPart[i] = arr[i];
            secondPart[i] = arr[j];
        }

        Thread firstThread = new Thread(() -> calcNewVal(firstPart));
        Thread secondThread = new Thread(() -> calcNewVal(secondPart));

        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();

        for (int i = 0; i < arr.length; i++) {
            if (i < halfSize) {
                arr[i] = firstPart[i];
            } else {
                arr[i] = secondPart[i - halfSize];
            }
        }

        long finishTime = System.currentTimeMillis();

        System.out.printf("time in twoArr func: %d ms%n", finishTime - startTime);
    }

    private static void calcNewVal(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
    }
}
