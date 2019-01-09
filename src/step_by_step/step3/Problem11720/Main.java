// https://www.acmicpc.net/problem/11720

package step_by_step.step3.Problem11720;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String str = sc.nextLine();
        int result = 0;
        for (int i = 0; i < Integer.parseInt(n); i++) {
            result += str.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
