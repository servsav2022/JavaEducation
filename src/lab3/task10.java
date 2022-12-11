package lab3;

//10. Напишите программу, в которой создается целочисленный массив,
// заполняется случайными числами и после этого значения элементов
// в массиве сортируются в порядке убывания значений.

import java.util.Arrays;
import java.util.Random;




public class task10 {
    public static void main(String[] args) {

        int size =10;
        int[] nums = new int[size];
        Random random= new Random();
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=random.nextInt(99);
            System.out.print(nums[i]+", ");
        }
        System.out.println();
        int[] temp;
       temp = nums.clone();
        Arrays.sort(temp);
        int np=0;
       for (int i = size-1; i>=0; i=i-1) {
            nums[np]=temp[i];
           System.out.print(nums[np]+", ");
            np=np+1;
        }
    }
}
