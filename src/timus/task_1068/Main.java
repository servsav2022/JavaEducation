package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Summ = 0;
        if (n < 1) {
            for (int i = n; i <= 1; i++) {
                Summ += i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                Summ += i;
            }
        }
        System.out.println(Summ);
    }
}