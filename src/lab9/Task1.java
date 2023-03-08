package lab9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        int count = 0;

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Среднее значение среди положительных элементов массива = " + average);
    }
}
// нужно доделать добавить исключения