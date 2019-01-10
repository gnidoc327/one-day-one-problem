// https://www.acmicpc.net/problem/4344

package step_by_step.step4.Problem4344;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            float avg = 0;
            for (int j = 0; j < n; j++) {
                int score = sc.nextInt();
                arrayList.add(score);
                avg += score;
            }
            avg /= n;

            int loser = 0;
            for (int score : arrayList) {
                if (score > avg) {
                    loser += 1;
                }
            }

            System.out.printf("%.3f", 100.0 * loser / n);
            System.out.println("%");

//            같은 결과이지만 오답임
//            double result = 100.0 * loser / n;
//            result = Math.round(result * 1000) / 1000.0;
//            System.out.println(result + "%");
        }
    }
}
