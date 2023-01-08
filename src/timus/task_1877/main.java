package timus.task_1877;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int code1= in.nextInt();
        int code2= in.nextInt();

        if (code1 % 2 == 0 || code2 % 2 !=0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
