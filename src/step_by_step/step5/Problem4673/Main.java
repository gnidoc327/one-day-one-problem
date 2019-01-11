// https://www.acmicpc.net/problem/4673

package step_by_step.step5.Problem4673;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int max = 10000;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= max; i++) {
            String num = Integer.toString(i);
            int gen = i;
            for (int j = 0; j < num.length(); j++) {
                gen += Character.getNumericValue(num.charAt(j));
            }
            hashSet.add(gen);
        }
        for (int i = 1; i <= max; i++) {
            if (!hashSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
