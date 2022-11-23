package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст");
        int age = in.nextInt();
        System.out.println("Ваш год рождения: "+ (today.getYear() - age));
        in.close();
    }
}

