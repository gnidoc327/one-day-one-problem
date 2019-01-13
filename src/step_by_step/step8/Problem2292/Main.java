// https://www.acmicpc.net/problem/2292

package step_by_step.step8.Problem2292;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int i = 0;
        while (true) {
            if (arrayList.get(i) >= n) {
                System.out.println(i + 1);
                break;
            } else {
                arrayList.add(arrayList.get(i) + 6 * (i + 1));
                i++;
            }
        }
    }
}
