// https://www.acmicpc.net/problem/2941

package step_by_step.step7.Problem2941;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cs = sc.nextLine().toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            int len = isCroAlphabet(Arrays.copyOfRange(cs, i, i + 3));
            if (len > 0) {
                i += len - 1;
            }
            count++;
        }

        System.out.println(count);
    }

    static int isCroAlphabet(char[] cs) {
        String[] croAlphabets = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for (String croAlphabet : croAlphabets) {
            if (String.valueOf(cs).contains(croAlphabet)) {
                return croAlphabet.length();
            }
        }
        return -1;
    }
}
