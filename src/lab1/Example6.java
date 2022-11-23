package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите Фамаилию: ");
        String fName = in.nextLine();

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите Отчество: ");
        String oName = in.nextLine();

        System.out.println("Hello: " + fName +" "+ name +" "+oName);
        in.close();
    }
}
