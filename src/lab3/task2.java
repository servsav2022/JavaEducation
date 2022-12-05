package lab3;

//2. Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.


import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели маленькими буквами");
        String a= in.next();

        switch (a) {
            case "понедельник":
                System.out.println(1);
                break;
            case "вторник":
                System.out.println(2);
                break;
            case "среда":
                System.out.println(3);
                break;
            case "четверг":
                System.out.println(4);
                break;
            case "пятница":
                System.out.println(5);
                break;
            case "суббота":
                System.out.println(6);
                break;
            case "воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("такого дня нет");
        }

        if (a.contains("понедельник")) {
            System.out.println(1 + " версия с If else");
        } else if (a.contains("вторник")) {
            System.out.println(2 + " версия с If else");
        } else if (a.contains("среда") ) {
            System.out.println(3 + " версия с If else");
        } else if (a.contains("четверг")) {
            System.out.println(4 + " версия с If else");
        } else if (a.contains("пятница")) {
            System.out.println(5 + " версия с If else");
        } else if (a.contains("суббота")) {
            System.out.println(6 + " версия с If else");
        } else if (a.contains("воскресенье")) {
            System.out.println(7 + " версия с If else");
        } else {
            System.out.println("такого дня нет версия с If else");
        }
        in.close();
    }

}
