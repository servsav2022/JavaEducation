package timus.task_1639;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m= in.nextInt();
        int n= in.nextInt();
        int result = (m*n) % 2;
        System.out.println((result!=0)?("[second]=:]") : ("[:=[first]"));
    }
}
