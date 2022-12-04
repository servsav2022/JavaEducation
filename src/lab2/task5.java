package lab2;

import java.util.Scanner;

//5. Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a ");
        long a= in.nextLong();

        String stroka = String.valueOf(a);
        System.out.println("Согласно условиям задачи цифра четвертая справа это " + stroka.charAt(stroka.length()-4));
    }
}
