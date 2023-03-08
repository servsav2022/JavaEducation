package lab9;

import java.util.Random;
import java.util.Scanner;

    public class Task2 {

        public static void main(String[] args) {
            Random rand = new Random();
            int[][] matrix = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matrix[i][j] = rand.nextInt(100);
                }
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер столбца: ");
            int column = scanner.nextInt();

            System.out.println("Столбец " + column + " матрицы:");
            for (int i = 0; i < 10; i++) {
                System.out.println(matrix[i][column]);
            }
        }
    }
// нужно доделать добавить исключения
