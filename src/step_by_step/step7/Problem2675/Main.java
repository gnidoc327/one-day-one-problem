// https://www.acmicpc.net/problem/2675

package step_by_step.step7.Problem2675;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String[] str = sc.nextLine().split(" ");
            int repeat = Integer.parseInt(str[0]);
            for (int j = 0; j < str[1].length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(str[1].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
