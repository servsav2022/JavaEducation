package lab6;
import java.util.Arrays;
//10. Напишите программу со статическим методом,
// аргументом которому передается про-извольное количество целочисленных аргументов.
// Результатом метод возвращает массив из двух элементов:
// это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
//
class Lab6Task10 {
    public static int[] maxMin(int ...ints){
        int max = ints[0];
        int min = ints[0];
        for (int i =0; i<ints.length; i++) {
            max = Math.max(max, ints[i]);
            min = Math.min(min, ints[i]);
        }
        int[] values=new int[2];
        values[0]=max;
        values[1]=min;
        return values;
    }
}
public class task10 {
    public static void main(String[] args) {
        System.out.println("Введенный массив "+Arrays.toString(new int[]{123,12,13,43,5,45}));
        System.out.println("максимальное значение = "+Lab6Task10.maxMin(123,12,13,43,5,45)[0]);
        System.out.println("минимальное значение = "+Lab6Task10.maxMin(123,12,13,43,5,45)[1]);
        System.out.println(Arrays.toString((Lab6Task10.maxMin(123,12,13,43,5,45))));
    }
}
