// https://www.acmicpc.net/problem/10250

package step_by_step.step8.Problem10250;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] input = new int[t][3];
        for (int i = 0; i < t; i++) {
            input[i][0] = sc.nextInt(); // h
            input[i][1] = sc.nextInt(); // w
            input[i][2] = sc.nextInt(); // n
        }

        for (int[] arr : input) {
            calc(arr[0], arr[1], arr[2]);
        }
    }

    static void calc(int h, int w, int n) {
        int a = n % h;
        int b = n / h + 1;
        if (a == 0) {
            a = h;
        }
        if (a == h) {
            b -= 1;
        }

        System.out.printf("%d%02d\n", a, b);
    }
}
