package lab11.tasks.task2;
//2. Создать приложение с использованием рекурсии для перевода целого числа,
//   введенного с клавиатуры, в двоичную систему счисления.

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binary = convertToBinary(n);
        System.out.println(binary);
    }

    public static String convertToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        return binary;
    }
}