package lab3;


//3. Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите какое количество чисел фибоначи хотите увидеть");
        int n= in.nextInt();

        int[] mas = new int[n];
        mas[0] = 1;
        mas[1] = 1;
        for (int i = 2; i < mas.length; ++i) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }
        System.out.println("Вывод решения с использованием цикла for");
        for (int i=0; i<n; i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();


        mas[0] = 1;
        mas[1] = 1;
        int i = 2;
        while (i < mas.length){
            mas[i] = mas[i - 1] + mas[i - 2];
            i++;
        }
        System.out.println("Вывод решения с использованием цикла while");
        for (int j=0; j<n; j++){
            System.out.print(mas[j]+" ");
        }
    }
}
