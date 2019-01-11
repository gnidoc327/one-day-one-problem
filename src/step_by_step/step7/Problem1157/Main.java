// https://www.acmicpc.net/problem/1157

package step_by_step.step7.Problem1157;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            c = Character.toUpperCase(c);
            if (hashMap.get(c) == null) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }
        int maxCount = 0;
        char maxChar = '?';
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            } else if (maxCount == entry.getValue()) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);
    }
}
