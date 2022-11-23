package lab1;

import java.time.*;
import java.util.Scanner;


public class Example10 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год вашего рождения: ");
        int year = in.nextInt();
        //нашел два способа перевода инт в стринг
        //System.out.println("Ваш возраст: "+ String.valueOf(today.getYear()-year));
        System.out.println("Ваш возраст: "+ (today.getYear() - year));
    }
}
