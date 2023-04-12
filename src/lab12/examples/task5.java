package lab12.examples;
/*
5.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
 содержащий только те строки, которые содержат заданную подстроку.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task5 {
    public static List<String> filterStrings(List<String> input, String substring) {
        return input.stream()
                .filter(str -> str.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date");
        String substring = "a";
        List<String> filtered = filterStrings(input, substring);
        System.out.println("исходные строки: "+ "\n" + input);
        System.out.println("\n"+ "подстрока: " + substring + "\n");
        System.out.println("строки содержащие подстроку: ");
        System.out.println(filtered);
    }
}