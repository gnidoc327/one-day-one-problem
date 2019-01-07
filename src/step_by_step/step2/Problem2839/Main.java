// https://www.acmicpc.net/problem/2839

package step_by_step.step2.Problem2839;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 3, b = 5;
        for (int i = n / b; i >= 0; i--) {
            int m = n - b * i;
            if (m % a == 0) {
                System.out.println(i + m / a);
                return;
            }
        }
        System.out.println(-1);
    }
}
