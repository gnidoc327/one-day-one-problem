// https://www.acmicpc.net/problem/1110

package step_by_step.step4.Problem1110;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origin = sc.nextInt();
        int n = origin;
        int count = 0;
        while (true) {
            int a = n / 10;
            int b = n % 10;
            int c = (a + b) % 10;
            n = b * 10 + c;
            count++;
            if (n == origin) {
                break;
            }
        }
        System.out.println(count);
    }
}
