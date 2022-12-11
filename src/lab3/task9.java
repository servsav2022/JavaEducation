package lab3;
//
//9. Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner id =new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size =id.nextInt();

        int[] nums = new int[size];
        Random random= new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i]=random.nextInt(20);
            System.out.println("Эелемен массива ["+i+"] = " + nums[i]);
        }
        System.out.println();
        Arrays.sort(nums); //сортировка по возрастанию следовательно нулевой элемент минимальный
        System.out.println("Минимальный элемент = "+nums[0]+" с позицей 0");
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i]==nums[0]){
                System.out.println("А так же равный минимальному "+nums[i]+" с позицей "+i);
            }
        }
        System.out.println("массив после сортировки");
        for (int j = 0; j < nums.length; j++) {
            System.out.println("Эелемен массива ["+j+"] = " + nums[j]);
        }
        id.close();
    }
}
