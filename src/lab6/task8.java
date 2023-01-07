package lab6;
import java.util.Arrays;
//8. Напишите программу со статическим методом, аргументом которому передается цело-численный массив,
// а результатом возвращается среднее значение для элементов массива
// (сумма значений элементов, деленная на количество элементов в массиве).
//
class Lab6Task8 {
    public static float avgMethod(int[] arr){
        int sum=0;
        for (int i = 0 ; i <arr.length; i++){
            sum += arr[i];
        }
        return (float) sum/arr.length;
    }
}
public class task8 {
    public static void main(String[] args) {
        int[] arr3 ={0,1,2,3,4,5,-7,11};
        System.out.println("среднее значение для элементов массива"+ Arrays.toString(arr3));
        System.out.println("Avg = "+Lab6Task8.avgMethod(arr3));
    }
}
