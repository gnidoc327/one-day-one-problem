// https://www.acmicpc.net/problem/1152

package step_by_step.step6.Problem1152;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().trim().split(" ");

        int count = 0;
        for (String str : strs) {
            if (!str.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
