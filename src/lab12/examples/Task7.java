package lab12.examples;
/*
7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
 содержащий только те строки, которые имеют длину больше заданного значения.
 */


import java.util.List;

public class Task7 {

    public static void main(String[] args) {
        int length = 6;
        List<String> input = List.of("apple", "banana", "cherry", "date", "elderberry", "passion fruit" );
        List<String> output = filterStrings(input, length);
        System.out.println("Исходные строки: " + input);
        System.out.println("Строки длиннее заданого значеничя");
        System.out.println(output); // prints [banana, cherry, elderberry]
    }

    public static List<String> filterStrings(List<String> input, int length) {
        return input.stream()
                .filter(str -> str.length() > length)
                .toList();
    }
}