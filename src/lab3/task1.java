    //1. Напишите программу, в которой пользователь вводит целое число
   //     в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
   //     Если введенное пользователем число выходит за допустимый диапазон,
   //     выводится сообщение о том, что введено некорректное значение. Используйте
    //    оператор выбора switch.
    package lab3;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 ");
        int a= in.nextInt();

        switch (a) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("число выходит за допустимый диапазон");
        }

    }
}
