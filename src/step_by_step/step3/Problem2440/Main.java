// https://www.acmicpc.net/problem/2440

package step_by_step.step3.Problem2440;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = a - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
