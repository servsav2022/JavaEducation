package lab13;

/*
5. Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
 Количество потоков должно быть равно количеству ядер процессора.
 */

import java.util.Arrays;

public class Task5 {

    public static int maxElement(int[] arr) throws InterruptedException {
        int numThreads = Runtime.getRuntime().availableProcessors(); // получаем количество ядер процессора
        int chunkSize = arr.length / numThreads; // вычисляем размер чанка
        if (chunkSize == 0) {
            chunkSize = 1; // устанавливаем минимальный размер чанка
            numThreads = arr.length; // устанавливаем количество потоков равным размеру массива
                                     // в случае если ядер процессора больше чем элементов в массиве
        }
        int[] maxes = new int[numThreads]; // массив для хранения максимальных элементов каждого чанка

        // Создаем и запускаем потоки
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? arr.length : (i + 1) * chunkSize;
            int finalChunkSize = chunkSize;
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    int max = arr[start];
                    for (int j = start + 1; j < end; j++) {
                        if (arr[j] > max) {
                            max = arr[j];
                        }
                    }
                    maxes[start / finalChunkSize] = max;
                }
            });
            threads[i].start();
        }

        // Ждем завершения всех потоков
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        // Находим максимальный элемент
        int max = maxes[0];
        for (int i = 1; i < numThreads; i++) {
            if (maxes[i] > max) {
                max = maxes[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 6, 2, 8, 9, 5, 99, -9, 11, 4, 33, 0};
        try {
            System.out.println("Количество ядер: " + Runtime.getRuntime().availableProcessors());
            System.out.println("Массив: "+ Arrays.toString(arr));
            System.out.println("\n" + "Если длина массива меньше чем кол-во ядер," + "\n" +
                    " то массив обработало столько потоков, какой размер массива: " + arr.length + "\n" );
            System.out.println("Максимальный элемент в массиве: " + maxElement(arr));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}