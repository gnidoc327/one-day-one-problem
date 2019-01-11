// https://www.acmicpc.net/problem/10039

package step_by_step.step6.Problem10039;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int score = sc.nextInt();
            total += score < 40 ? 40 : score;
        }
        System.out.println(total / 5);
    }
}
