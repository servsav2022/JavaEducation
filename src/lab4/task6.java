package lab4;

import java.util.Random;

//6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец
// (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
// Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
//
public class task6 {
    public static void main(String[] args) {

        int n=3; // кол-во строк
        int m=5; // кол-во столбцов

        int[][] array = new int[n][m]; // исходный массив
        int[][] arrChanged = new int[n-1][m-1]; // массив с удаленной строкой и столбцом
        Random rnd = new Random();
        int dn=rnd.nextInt(n-1);  // Индекс удаляемой строки
        int dm=rnd.nextInt(m-1);  // Индекс удаляемого столбца
        //заполняю массив
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rnd.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //заполняю новый массив игнорируя строку и столбец из первого
        for (int i = 0, str=0; i < n-1; str++) {
            if (str!=dn){
                for (int j = 0, stl=0; j < m-1; stl++) {
                    if (stl != dm) {
                        arrChanged[i][j] = array[str][stl];
                        j++;
                    }
                }
                i++;
            }
        }
        // вывод
        System.out.println("Индекс удаленной строки "+ dn);
        System.out.println("Индекс удаленного стоблца "+ dm);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                System.out.print(arrChanged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
