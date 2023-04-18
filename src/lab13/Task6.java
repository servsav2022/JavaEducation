package lab13;
/*
6. Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
 Количество потоков должно быть равно количеству ядер процессора.
 */

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task6 {
    private static int sum(int[] array) {
        int numThreads = Math.min(Runtime.getRuntime().availableProcessors(), array.length);
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int chunkSize = array.length / numThreads;

        // Создаем объекты для выполнения вычислений
        SumTask[] tasks = new SumTask[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;
            tasks[i] = new SumTask(array, start, end);
            executor.execute(tasks[i]);
        }

        // Дожидаемся завершения всех потоков
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вычисляем общую сумму
        int totalSum = 0;
        for (SumTask task : tasks) {
            totalSum += task.getPartialSum();
        }
        return totalSum;
    }

    private static class SumTask implements Runnable {
        private final int[] array;
        private final int start;
        private final int end;
        private int partialSum;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                partialSum += array[i];
            }
        }

        public int getPartialSum() {
            return partialSum;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sum(array);
        System.out.println("коли-во ядер процессора: " +
                Runtime.getRuntime().availableProcessors() + "\n");
        System.out.println("Исходный массив: " +"\n" +
                Arrays.toString(array) + "\n");
        System.out.println("Кол-во потоков которое обрабатывало массив: " +
                Math.min(Runtime.getRuntime().availableProcessors(), array.length));
        System.out.println("Sum: " + sum);
    }
}