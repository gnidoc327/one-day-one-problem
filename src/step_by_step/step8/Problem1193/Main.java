// https://www.acmicpc.net/problem/1193

package step_by_step.step8.Problem1193;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        calc(x);
    }

    static void calc(int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        int n = 0;
        // f(2n + 2) = f(2n) + 4n + 1
        while (true) {
            if (arrayList.get(n) >= x) {
                if (arrayList.get(n) == x) {
                    System.out.println(1 + "/" + 2 * (n + 1));
                } else {
                    int m = 2 * n;
                    int diff = arrayList.get(n) - x - 1;
                    int up, down;
                    if (m < diff) {
                        diff = diff - m - 1;
                        up = 2 * n - diff;
                        down = 1 + diff;
                    } else {
                        up = 1 + diff;
                        down = 2 * n + 1 - diff;
                    }

                    System.out.println(up + "/" + down);
                }
                break;
            } else {
                n++;
                arrayList.add(arrayList.get(n - 1) + 4 * n + 1);
            }
        }
    }
}
