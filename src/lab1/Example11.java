package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше Имя");
        String name = in.nextLine();

        System.out.println("Введите и год вашего рождения: ");
        int year = in.nextInt();

        System.out.println("Вас зовут "+name+" и ваш возраст возраст: "+ (today.getYear() - year));
    }
}
