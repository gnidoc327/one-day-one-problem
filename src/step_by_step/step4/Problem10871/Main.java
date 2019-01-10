// https://www.acmicpc.net/problem/10871

package step_by_step.step4.Problem10871;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input < x) {
                arrayList.add(input);
            }
        }
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
