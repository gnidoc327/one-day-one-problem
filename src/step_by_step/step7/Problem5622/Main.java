// https://www.acmicpc.net/problem/5622

package step_by_step.step7.Problem5622;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cs = sc.nextLine().toCharArray();
        int sec = 0;
        for (char c : cs) {
            if (c < 'P') {
                sec += (c - 'A') / 3 + 3;
            } else if (c < 'T') {
                sec += 8;
            } else if (c < 'W') {
                sec += 9;
            } else {
                sec += 10;
            }
        }
        System.out.println(sec);
    }
}
