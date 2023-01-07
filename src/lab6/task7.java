package lab6;
import java.util.Arrays;
//7. Напишите программу со статическим методом, аргументом которому передастся символьный массив,
// а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.
//
class Lab6task7 {
    public static int[] converter(char[] chars) {
        int[] intArr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            intArr[i] = chars[i];
        }
        return intArr;
    }
}
public  class task7 {
    public static void main(String[] args) {
        char[] chrs={'a','b','c','d','e','f'};
        System.out.println("Коды символов переданных через аргумент массивом "+Arrays.toString(Lab6task7.converter(chrs)));
    }
}
