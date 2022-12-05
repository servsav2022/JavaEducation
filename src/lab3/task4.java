package lab3;

import java.util.Scanner;

//4. Напишите программу, в которой пользователем вводится два
//целых числа. Программа выводит все целые числа — начиная с наименьшего
//(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//чисел). Предложите разные версии программы (с использованием разных
//операторов цикла).
//
public class task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число a ");
        int a= in.nextInt();
        System.out.println("Введите целое число b ");
        int b= in.nextInt();
// версия с циклом for
        if (a>b){
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
// версия с циклом while
        } else if (b>a){
            int i = a;
            while (i <= b) {
                System.out.print(i + " ");
                ++i;
            }
            System.out.println();
        } else if (a==b){
            System.out.println("введённые числа  a и b  равно, введите разные целые числа");
        }

    }
}
