package lab9;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*Задание 2
        В программе, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры,
         могут возникать ошибки в следующих случаях:
        –	ввод строки вместо числа;
        –	нет столбца с таким номером.
*/
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
            boolean validColumn = false;
            int column = 0;
            while (!validColumn) {
                try {
                    System.out.print("Введите номер столбца: ");
                    column = scanner.nextInt();
                    validColumn = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: " + e.getMessage() + ". Пожалуйста, введите целое число.");
                    scanner.nextLine();
                }
            }

            try {
                System.out.println("Столбец " + column + " матрицы:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(matrix[i][column]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Номер столбца должен быть от 0 до 9.");
            }
        }
    }

