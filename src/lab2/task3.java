package lab2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a ");
        int a= in.nextInt();

        if (a%4==0 && a>=10) {
            System.out.println("Введеное число делится на 4 и оно больше 10");

        }
        else {
            System.out.println("ВВеденое число не делится на 4 или оно меньше 10");
        }
        in.close();
    }
}
