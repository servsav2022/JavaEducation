package lab12.examples;
/*
9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
содержащий только те строки, которые содержат только буквы (без цифр и символов).
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello World!", "12345", "Java8", "OnlyLetters");
        List<String> onlyLetters = filterOnlyLetters(strings);
        System.out.println("исходный список строк: " + strings);
        System.out.println("строки, которые содержат только буквы (без цифр и символов): ");
        System.out.println(onlyLetters);
    }

    public static List<String> filterOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("^[a-zA-Z]+$"))
                .collect(Collectors.toList());
    }
}