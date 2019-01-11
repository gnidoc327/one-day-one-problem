// https://www.acmicpc.net/problem/1065

package step_by_step.step5.Problem1065;


import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                count++;
                continue;
            }
            if (validHansu(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean validHansu(int input) {
        String num = String.valueOf(input);
        int diff = num.charAt(0) - num.charAt(1);
        for (int i = 1; i < num.length() - 1; i++) {
            if (diff != (num.charAt(i) - num.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }
}
