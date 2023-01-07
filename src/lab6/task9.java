package lab6;

import java.util.Arrays;

//9. Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
// В результате вызова метода элементы массива попарно меняются местами
// : первый — с последним, второй — с предпоследним и так далее.
//
class Lab6Task9 {
    static public char[] reverse(char[] chars) {
        char[] array = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            array[i] = chars[chars.length - i - 1];
        }
        return array;
    }
}
public class task9 {
    public static void main(String[] args) {
        char[] arr1={'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println("Массив до перестановки "+Arrays.toString(arr1));
        System.out.println("Массив после перестановки "+Arrays.toString(Lab6Task9.reverse(arr1)));
    }
}
