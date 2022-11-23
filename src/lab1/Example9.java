package lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней: ");
        int countDays = in.nextInt();

        System.out.println(month+" месяц содержит "+countDays+" дней.");
        in.close();
    }
}
