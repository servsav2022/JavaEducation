package lab9;
/*
Задание 1
В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
 вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	несоответствие числового типа данных;
–	положительные элементы отсутствуют.
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            int sum = 0;
            int count = 0;
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                try {
                    array[i] = sc.nextInt();
                    if (array[i] > 0) {
                        sum += array[i];
                        count++;
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка! Введено неверное значение. Попробуйте еще раз.");
                    sc.nextLine();
                    i--;
                }
            }
            if (count == 0) {
                throw new Exception("Ошибка! Положительные элементы отсутствуют.");
            }
            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов массива = " + average);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}