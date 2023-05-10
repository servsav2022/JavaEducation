package timus.task_1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x, y, r, x1, y1, xPr, yPr, a, b, Summ = 0;
        r = scanner.nextDouble();
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        xPr = x1;
        yPr = y1;
        for (int i = 0; i < n - 1; i++) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            a = x - xPr;
            b = y - yPr;
            xPr = x;
            yPr = y;
            Summ += Math.sqrt(a * a + b * b);
            if (i == n - 2) {
                a = x - x1;
                b = y - y1;
                Summ += Math.sqrt(a * a + b * b);
            }
        }
        Summ += 2 * Math.PI * r;
        System.out.printf("%.2f", Summ);
    }
}