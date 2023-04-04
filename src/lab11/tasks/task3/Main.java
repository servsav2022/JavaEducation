package lab11.tasks.task3;

import java.util.Scanner;

/*
3. Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
 Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите значения массива:");
        inputArray(array, 0);

        System.out.println("Введенный массив:");
        outputArray(array, 0);
    }

    private static void inputArray(int[] array, int index) {
        if (index < array.length) {
            Scanner scanner = new Scanner(System.in);
            array[index] = scanner.nextInt();
            inputArray(array, index + 1);
        }
    }

    private static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}