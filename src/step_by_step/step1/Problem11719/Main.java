// https://www.acmicpc.net/problem/11719

package step_by_step.step1.Problem11719;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        boolean isBeforeEmpty = false;

        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                if (isBeforeEmpty) {
                    break;
                } else {
                    isBeforeEmpty = true;
                }
            } else {
                isBeforeEmpty = false;
            }
            inputs.add(input);
        }

        for (String input : inputs) {
            System.out.println(input);
        }
    }
}
