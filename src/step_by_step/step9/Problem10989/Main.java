// https://www.acmicpc.net/problem/10989

package step_by_step.step9.Problem10989;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

//        test code
//        int[] arr = {5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
//        int[] arr = {5, 2, 3, 4, 1};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {5, 4, 3, 2, 1};
//        int[] arr = {1, 1, 1, 2, 3};
//        int[] arr = {1, 2, 1, 1, 3};
//        int[] arr = {1, 3, 1, 1, 2};
//        int[] arr = {3, 2, 1, 1, 1};

        sort(arr);
    }

    static void sort(int[] arr) throws IOException {
        int max = 10000;
        int[] counts = new int[max];

        int maxIndex = 0;
        for (int i : arr) {
            int index = i - 1;
            counts[index] = counts[index] + 1;
            if (maxIndex < i) {
                maxIndex = i;
            }
        }

        for (int i = 1; i < maxIndex; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        int[] sortedArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int countIndex = arr[i] - 1;
            int arrIndex = counts[countIndex];
            counts[countIndex] = counts[countIndex] - 1;
            sortedArr[arrIndex - 1] = arr[i];
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : sortedArr) {
            bufferedWriter.write(i + "\n");
        }
        bufferedWriter.flush();
    }
}

