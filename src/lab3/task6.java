package lab3;


//6. Напишите программу, в которой создается одномерный числовой
//массив и заполняется числами, которые при делении на 5 дают в остатке 2
//(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
//Предусмотреть обработку ошибки, связанной с вводом некорректного
//значения.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве ");
        int kol=0;
        //проверка ввода
        do {
            while(!in.hasNextInt()) {
                System.out.println("Введите целое число!!!  ");
                in.next();
            }
            System.out.println("Введите целое положительное число!!!  ");
            kol = in.nextInt();
        }
        while(kol <= 0);

        System.out.println();

        int[] mas = new int[kol]; // массив с подходящими под условия числами
        int n = 0; // счетчик для массива
        int i = 0; // счетчик для поиска подходящих чисел

        while (n < kol) {
            i++;
            if (i % 5 == 2) {
                mas[n] = i;
                n++;
            }
        }
//Вывод массива на жэкран
        for (int j = 0; j < kol; j++) {
            System.out.print(mas[j] + " ");
        }
        System.out.println();
        in.close();
    }
}