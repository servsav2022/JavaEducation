package lab4;

//2. Напишите программу, которая выводит в консольное окно прямоугольный треугольник;
//

public class task2 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j =1 ; j <= i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
