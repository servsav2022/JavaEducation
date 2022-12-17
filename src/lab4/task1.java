package lab4;

//1. Напишите программу, которая выводить в консольное окно прямоугольник,
// размеры сторон которого, ширина: 23 колонки, высота: 11 строк;
//


public class task1 {
    public static void main(String[] args) {

        for (int i = 1; i <12; i++) {
            for (int j = 1; j < 24; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
