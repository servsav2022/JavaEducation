package lab2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a ");
        int a= in.nextInt();

        if (a>=5 && a<=10) {
            System.out.println("Введеное пользователем число попадает в диапазон от 5 до 10 включительно.");

        }
        else {
            System.out.println("Введеное пользователем число НЕ попадает в диапазон от 5 до 10 включительно.");
        }
        in.close();
    }
}
