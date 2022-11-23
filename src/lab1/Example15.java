package lab1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a ");
        int a= in.nextInt();
        System.out.println("Введите число b ");
        int b= in.nextInt();

        System.out.println("Сумма чисел a+b="+(a+b));
        System.out.println("Сумма чисел a-b="+(a-b));
        in.close();
    }
}
