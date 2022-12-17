package lab4;
import java.util.Random;
//5. Напишите программу, в которой создается двумерный целочисленный массив.
// Он заполняется случайными числами.
// Затем в этом массиве строи и столбцы меняются местами:
// первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.
public class task5 {
    public static void main(String[] args) {
        int n=3; // кол-во строк
        int m=5; // кол-во столбцов

        int[][] array = new int[n][m]; // исходная матрица
        int[][] trans_arr = new int[m][n]; //транспонированная матрица
        Random rnd = new Random();
        // заполняется исходный массив и выводится на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rnd.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // транспонируем
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans_arr[j][i] = array[i][j];
            }
        }
        // выводим транспонированную
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(trans_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

