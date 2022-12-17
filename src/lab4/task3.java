package lab4;

//3. Напишите программу, в которой создается двумерный массив, который выводи прямоугольник из цифр 2;
//
public class task3 {
    public static void main(String[] args) {
        int [][] array =new int[5][10];
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <10 ; j++) {
                array[i][j]=2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
