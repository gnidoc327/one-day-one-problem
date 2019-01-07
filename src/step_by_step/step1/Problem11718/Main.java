// https://www.acmicpc.net/problem/11718

package step_by_step.step1.Problem11718;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        for (String input : inputs) {
            System.out.println(input);
        }
    }
}
