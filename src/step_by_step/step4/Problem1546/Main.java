// https://www.acmicpc.net/problem/1546

package step_by_step.step4.Problem1546;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float avg = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            avg += input;
            if (max < input) {
                max = input;
            }
        }
        avg /= n;

        System.out.print(avg / max * 100);
    }
}
