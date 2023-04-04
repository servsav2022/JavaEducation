package lab11.tasks.task1;
/* 1. Создать приложения для демонстрации примеров 1 – 5 из раздела 1.
 Для примера 5 дополнительно вывести последовательность обхода дерева рекурсивных вызовов.
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        printFact(5,0);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2) + fact(n - 1);
        }
    }
    public static void printFact(int n, int depth) {
        if (n == 0) {
            for (int i = 0; i < depth; i++) {
                System.out.print("  ");
            }
            System.out.println("fact(0) = 1");
        } else if (n == 1) {
            for (int i = 0; i < depth; i++) {
                System.out.print("  ");
            }
            System.out.println("fact(1) = 1");
        } else {
            for (int i = 0; i < depth; i++) {
                System.out.print("  ");
            }
            System.out.println("fact(" + n + ") = fact(" + (n-2) + ") + fact(" + (n-1) + ")");
            printFact(n - 2, depth + 1);
            printFact(n - 1, depth + 1);
        }
    }
}