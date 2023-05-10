package timus.task_1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int[] KolDel = new int[10];
        if (n == 0) {
            System.out.println(10);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                n /= i;
                KolDel[i]++;
            }
        }
        if (n != 1) {
            System.out.println(-1);
        } else {
            for (int i = 2; i <= 9; i++) {
                while (KolDel[i] > 0) {
                    System.out.print(i);
                    KolDel[i]--;
                }
            }
        }
    }
}