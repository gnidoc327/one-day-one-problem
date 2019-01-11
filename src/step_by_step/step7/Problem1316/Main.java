// https://www.acmicpc.net/problem/1316

package step_by_step.step7.Problem1316;


import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;


        for (int i = 0; i < n; i++) {
            char[] cs = sc.nextLine().toCharArray();
            if (isGroupWord(cs)) {
                count += 1;
            }
        }

        System.out.println(count);
    }

    static boolean isGroupWord(char[] cs) {
        HashSet<Character> set = new HashSet<>();
        char beforeChar = cs[0];
        set.add(beforeChar);
        for (int i = 1; i < cs.length; i++) {
            if (cs[i] != beforeChar && set.contains(cs[i])) {
                return false;
            }
            beforeChar = cs[i];
            set.add(cs[i]);
        }
        return true;
    }
}
