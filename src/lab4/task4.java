package lab4;
//4. Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник;

public class task4 {
    public static void main(String[] args) {
        int [][] array =new int[10][10];

        for (int i = 0; i <10; i++) {
            for (int j =0 ; j <= i; j++) {
                array[i][j]=1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
