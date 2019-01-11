// https://www.acmicpc.net/problem/11654

package step_by_step.step7.Problem10809;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(str.indexOf(String.valueOf(c)) + " ");
        }
    }
}
