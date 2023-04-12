package lab12.examples;

import java.util.List;

/*
10.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
содержащий только те числа, которые меньше заданного значения.
 */
public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int setValue = 5;
        List<Integer> result = filterNumbersLessThanSetValue(numbers, setValue);
        System.out.println("Список целых чисел: " + numbers);
        System.out.println("Заданное число: " + setValue);
        System.out.println("Числа меньше заданного: " + result);
    }

    public static List<Integer> filterNumbersLessThanSetValue(List<Integer> numbers, int setValue) {
        return numbers.stream()
                .filter(num -> num < setValue)
                .toList();
    }
}
