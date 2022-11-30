package lab2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a ");
        int a= in.nextInt();

        if (a%3==0) {
            System.out.println(" Введенное число делится без остатка на 3");
        }
        else {
            System.out.println(" Введенное число не делится без остатка на 3, остаток ="+(a%3));
        }
        in.close();
    }
}
