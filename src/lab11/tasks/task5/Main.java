package lab11.tasks.task5;
/*5. Создать два проекта,
в которых продемонстрировать два способа создания линейного однонаправленного списка (с головы и с хвоста)
 согласно примеру 2 из второго раздела.
 Отработать код с помощью отладчика и привести скриншоты минимум трех точек, обработанных отладчиком.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем список с головы и добавляем элементы
        LinkedListFromHead listFromHead = new LinkedListFromHead();
        listFromHead.add(1);
        listFromHead.add(2);
        listFromHead.add(3);
        listFromHead.add(4);
        System.out.print("Список с головы: ");
        listFromHead.display(); // Ожидаемый вывод: Список с головы: 4 3 2 1

        // Создаем список с хвоста и добавляем элементы
        LinkedListFromTail listFromTail = new LinkedListFromTail();
        listFromTail.add(1);
        listFromTail.add(2);
        listFromTail.add(3);
        listFromTail.add(4);
        System.out.print("\nСписок с хвоста: ");
        listFromTail.display(); // Ожидаемый вывод: Список с хвоста: 1 2 3 4
    }
}