package lab12.examples;
/*
6.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
содержащий только те числа, которые делятся на заданное число без остатка.
 */
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int divisor = 3;
        List<Integer> filteredNumbers = filterByDivisor(numbers, divisor);
        System.out.println("Исходные числа: " +numbers +"\n");
        System.out.println("Заданное число: " + divisor);
        System.out.println("Числа которые делятся на заданное без остатка: ");
        System.out.println(filteredNumbers);
    }

    public static List<Integer> filterByDivisor(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }
}