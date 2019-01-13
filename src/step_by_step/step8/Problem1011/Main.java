// https://www.acmicpc.net/problem/1011

package step_by_step.step8.Problem1011;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Date start = new Date();

        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        int[][] input = new int[t][2];
        int t = 3;
        int[][] input = {
                {0, (int) Math.pow(2, 31)}//, {1, 5}, {45, 50}
        };

//        for (int i = 0; i < t; i++) {
//            input[i][0] = sc.nextInt();
//            input[i][1] = sc.nextInt();
//        }

        int maxN = 0;
        for (int[] xy : input) {
            if (xy[1] - xy[0] > maxN) {
                maxN = xy[1] - xy[0];
            }
        }

        calc(maxN);

        for (int i = 0; i < t; i++) {
            int distance = input[i][1] - input[i][0];
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) >= distance) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }

        System.out.println("time : " + (new Date().getTime() - start.getTime()));
    }
    // f( 횟수 ) = 최대 거리
    // f( 2n - 1 ) = nn
    // f( 2n) ) = n(n+1)
    static void calc(int maxDistance) {
        arrayList.add(1);
        arrayList.add(2);

        int i = 3;
        while (true) {
            if (i % 2 == 0) {
                int j = i / 2;
                arrayList.add(j * (j + 1));
            } else {
                int j = (i + 1) / 2;
                arrayList.add(j * j);
            }
            if (arrayList.get(arrayList.size() - 1) > maxDistance) {
                return;
            }
            i++;
        }
    }
}
