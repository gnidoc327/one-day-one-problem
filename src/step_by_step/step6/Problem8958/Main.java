// https://www.acmicpc.net/problem/8958

package step_by_step.step6.Problem8958;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int stackedScore = 0;
            int addScore = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    addScore += 1;
                    stackedScore += addScore;
                } else if (str.charAt(j) == 'X') {
                    addScore = 0;
                }
            }
            results[i] = stackedScore;
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
