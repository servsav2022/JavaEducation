package lab11.tasks.task6;

import java.util.HashMap;
/*
6. Заполнить HashMap 10 объектами <Integer, String>.
 Найти строки, у которых ключ > 5. Если ключ = 0, вывести строки через запятую.
 Перемножить все ключи, где длина строки>5.
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // заполнение HashMap 10 объектами
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        map.put(5, "Ruby");
        map.put(6, "PHP");
        map.put(7, "Swift");
        map.put(8, "Kotlin");
        map.put(9, "Scala");
        map.put(10, "Go");

        // поиск строк с ключом > 5
        System.out.println("строки с ключом > 5");
        for (Integer key : map.keySet()) {
            if (key > 5) {
                System.out.println(map.get(key) + " " + key);
            }
        }

        // вывод строк через запятую, если ключ = 0

        if (map.containsKey(0)) {
            String result = String.join(",", map.values());
            System.out.println(result);
        }
        System.out.println();
        System.out.println("строки где лина строки > 5, и значения их ключей: ");
        // перемножение ключей со значениями, где длина строки > 5
        int product = 1;
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            if (value.length() > 5) {
                System.out.println(map.get(key) + " " + key);
                product *= key;
            }
        }
        System.out.println("Результат умножения ключей со значениями, где длина строки > 5 : " + product);
    }
}