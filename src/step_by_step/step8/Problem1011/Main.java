// https://www.acmicpc.net/problem/1011

package step_by_step.step8.Problem1011;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] input = new int[t][2];

        for (int i = 0; i < t; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            calc(input[i][1] - input[i][0]);
        }
    }

    static void calc(int distance) {
        if (distance <= 2) {
            System.out.println(distance);
            return;
        }
        int n = (int) Math.sqrt(distance);
        int result;
        if (distance == n * n) {
            result = 2 * n - 1;
        } else if (distance <= n * (n + 1)) {
            result = 2 * n;
        } else {
            result = 2 * (n + 1) - 1;
        }

        System.out.println(result);
    }
}
