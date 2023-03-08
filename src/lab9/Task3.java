package lab9;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив указанного размера
        byte[] array = new byte[size];

        // Заполняем массив значениями, введенными пользователем
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextByte();
        }

        // Выводим массив в одну строку
        System.out.print("Массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Считаем сумму элементов массива
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Выводим сумму на экран
        System.out.println("Сумма элементов массива: " + sum);
    }
}
// нужно доделать добавить исключения