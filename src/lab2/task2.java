package lab2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a ");
        int a= in.nextInt();

        if (a%5==2) {
            System.out.println(" остаток от деления на 5  -  2");
            if (a%7==1){
                System.out.println(" остаток от деления на 7  -  1");
            }
        }
        else {
            System.out.println("Остатки от деления на 5 и на 7 не соответствуют заданным условиям");
        }
        in.close();
        // подходящие под оба условия одновременно числа 22 127 722 7722
    }
}
