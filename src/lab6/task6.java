package lab6;
import java.util.Arrays;
//6. Напишите программу со статическим методом, которому аргументом передается цело-численный массив и целое число.
// Результатом метод возвращает ссылку на новый массив,
// который получается из исходного массива (переданного первым аргументом методу),
// если в нем взять несколько начальных элементов. Количество элементов, которые нужно взять из исходного массива,
// определяются вторым аргументом метода.
// Если второй аргумент метода больше длины массива, переданного первым аргументом,
// то методом создается копия исходного массива и возвращается ссылка на эту копию.
//
class Lab6Task6 {
    public static int[] sub(int[] arr, int n) {
        if (n >= arr.length) {
            return arr.clone();
        }else {
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = arr[i];
            }
            return arr2;
        }
    }
}
public class task6 {
    public static void main(String[] args) {
        int[] arr3 ={0,1,2,3,4,5,};
        System.out.println("Взято 4 элементов из исходного массива "+ Arrays.toString(Lab6Task6.sub(arr3,4)));
        System.out.println("второй аргумент метода больше длины массива "+ Arrays.toString(Lab6Task6.sub(arr3,8)));
    }
}