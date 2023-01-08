package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int numb = in.nextInt();
            for (int a = 1; a <= 98; a++) {
                for (int b = a + 1; b <= 99 ; b++) {
                    for (int c = b + 1; c <= 100; c++) {
                        if(Math.pow(a, numb) + Math.pow(b, numb) == Math.pow(c, numb)){
                            System.out.println(a + " "+ b +" "+ c);
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println("-1");
    }
}
