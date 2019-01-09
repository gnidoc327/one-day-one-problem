// https://www.acmicpc.net/problem/11721

package step_by_step.step3.Problem11721;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int unit = str.length() / 10;
        for (int i = 0; i < unit; i++) {
            System.out.println(str.substring(i * 10, (i + 1) * 10));
        }
        System.out.println(str.substring(unit * 10));
    }
}
