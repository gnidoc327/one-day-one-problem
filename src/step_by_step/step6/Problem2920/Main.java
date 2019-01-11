// https://www.acmicpc.net/problem/2920

package step_by_step.step6.Problem2920;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int diff = (strs[0].charAt(0) - '0') - (strs[1].charAt(0) - '0');
        for (int i = 2; i < strs.length; i++) {
            if (diff != ((strs[i - 1].charAt(0) - '0') - (strs[i].charAt(0) - '0'))) {
                System.out.println("mixed");
                return;
            }
        }

        if (diff > 0) {
            System.out.println("descending");
        } else {
            System.out.println("ascending");
        }
    }
}
