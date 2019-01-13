// https://www.acmicpc.net/problem/1475

package step_by_step.step8.Problem1475;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        if (n == 0) {
            hashMap.put(n, 1);
        }
        while (n != 0) {
            int num = n % 10;
            n = n / 10;
            if (num == 6) {
                num = 9;
            }
            if (hashMap.get(num) == null) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int value = entry.getValue();
            if (entry.getKey() == 9) {
                value = (int) Math.ceil(value / 2.0);
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
