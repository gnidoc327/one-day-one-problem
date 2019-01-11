// https://www.acmicpc.net/problem/2577

package step_by_step.step6.Problem2577;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long result = a * b * c;
        String str = String.valueOf(result);
        int[] resultArr = new int[10];
        for (int i = 0; i < 10; i++) {
            resultArr[i] = 0;
        }
        for (int i = 0; i < str.length(); i++) {
            resultArr[str.charAt(i) - '0']++;
        }
        for (int i : resultArr) {
            System.out.println(i);
        }
    }
}
