// https://www.acmicpc.net/problem/2908

package step_by_step.step7.Problem2908;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int a = Integer.parseInt(new StringBuilder(strs[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(strs[1]).reverse().toString());
        System.out.println(a > b ? a : b);
    }
}
