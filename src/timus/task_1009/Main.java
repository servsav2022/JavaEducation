package timus.task_1009;
import java.util.Scanner;

public class Main {
    static int K;
    static long[][] memo;

    public static long count(int n, int zeros) {
        if (zeros == 2) return 0;
        if (n == 1) return (zeros == 1 ? K - 1 : K);

        long ret = memo[n][zeros];

        if (ret == -1) {
            ret = (zeros == 1 ? 0 : count(n - 1, 1));
            ret += (K - 1)*count(n - 1, 0);
            memo[n][zeros] = ret;
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        K = input.nextInt();
        input.close();

        memo = new long[16][2];
        for (int i = 0; i < 16; i++) {
            memo[i][0] = memo[i][1] = -1;
        }

        long ans = (K - 1)*count(N - 1, 0);

        System.out.println(ans);
    }
}