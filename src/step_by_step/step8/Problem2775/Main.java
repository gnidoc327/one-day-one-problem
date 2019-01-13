// https://www.acmicpc.net/problem/2775

package step_by_step.step8.Problem2775;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] input = new int[t][2];

        for (int i = 0; i < t; i++) {
            input[i][0] = sc.nextInt(); // k
            input[i][1] = sc.nextInt(); // n
        }

        int[][] floors = new int[15][14];
        for (int i = 0; i < 14; i++) {
            floors[0][i] = i + 1;
        }
        for (int i = 1; i < 15; i++) {
            floors[i][0] = 1;
        }

        for (int h = 1; h < 15; h++) {
            for (int w = 1; w < 14; w++) {
                floors[h][w] = floors[h - 1][w] + floors[h][w - 1];
            }
        }

        for (int[] arr : input) {
            calc(floors, arr[0], arr[1]);
        }
    }

    static void calc(int[][] floors, int k, int n) {
        System.out.println(floors[k][n - 1]);
    }
}
