// https://www.acmicpc.net/problem/2448

package step_by_step.step5.Problem2448;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = (int) (Math.log(n / 3) / Math.log(2)) + 1;
        ArrayList<String> arrayList = getKStar(k);
        for (String str : arrayList) {
            System.out.println(str);
        }
    }

    static ArrayList<String> getOneStar() {
        ArrayList<String> star = new ArrayList<>();
        star.add("  *   ");
        star.add(" * *  ");
        star.add("***** ");
        return star;
    }

    static ArrayList<String> getKStar(int k) {
        if (k == 0) {
            return getOneStar();
        }
        return makeKStar(k, 1, getOneStar());
    }

    static ArrayList<String> makeKStar(int k, int step, ArrayList<String> beforeStar) {
        if (k == step) {
            return beforeStar;
        }

        ArrayList<String> newStar = new ArrayList<>();
        // top
        String space = getSpace(step);
        for (String str : beforeStar) {
            newStar.add(space + str + space);
        }

        // down
        for (String str : beforeStar) {
            newStar.add(str + str);
        }

        return makeKStar(k, step + 1, newStar);
    }

    static String getSpace(int step) {
        // 0, 3, 6, 12
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < (int) Math.pow(2, step - 1) * 3; i++) {
            space.append(" ");
        }
        return space.toString();
    }
}
