package timus.task_1025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n05 = n / 2 + 1;
        int ans = 0;
        ArrayList<Integer> groups = new ArrayList<Integer>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            groups.set(i, sc.nextInt());
        }

        for (int i = 0; i < n05; i++) {
            int min = Collections.min(groups);
            ans += min / 2 + 1;
            groups.remove(Integer.valueOf(min));
        }
        System.out.println(ans);
        sc.close();
    }
}