package lab3;


//5. Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
// или при делении на 3 в остатке получается 1. Количество чисел в сумме
//вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла.

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме ");
        int kolSum = in.nextInt();
        System.out.println();

        int[] mas = new int[kolSum]; // массив с подходящими под условия числами
        int n = 0; // счетчик для массива
        int i = 0; // счетчик для поиска подходящих чисел
        //
        // решение через цикл while
        //
        //        while (n < kolSum) {
        //            i++;
        //            if (i%5==2 && i%3==1){
        //                mas[n]=i;
        //                n++;
        //            }
        //        }
        // решение через цикл do{}while
        if (n < kolSum) {
            do {
                i++;
                if (i % 5 == 2 && i % 3 == 1) {
                    mas[n] = i;
                    n++;
                }
            } while (n < kolSum);
        }
        int summa=0;
        for (int j = 0; j <kolSum; j++) {
            System.out.print(mas[j]+ " ");
            summa=summa+mas[j];
        }
        System.out.println();
        System.out.println("сумма чисел = "+summa);
    }
}
