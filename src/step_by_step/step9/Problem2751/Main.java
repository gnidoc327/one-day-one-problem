// https://www.acmicpc.net/problem/2751

package step_by_step.step9.Problem2751;


import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

//        test code
//        int[] arr = {2, 3, 4, 1};
//        int[] arr = {5, 2, 3, 4, 1};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {5, 4, 3, 2, 1};
//        int[] arr = {1, 1, 1, 2, 3};
//        int[] arr = {1, 2, 1, 1, 3};
//        int[] arr = {1, 3, 1, 1, 2};
//        int[] arr = {3, 2, 1, 1, 1};

//      merge sort
        for (int num : mergeSort(arr)) {
            bufferedWriter.write(num + "\n");
        }

        bufferedWriter.flush();
    }

    static int[] mergeSort(int[] src) {
        int[] cpyArr = src.clone();

        return splitMerge(cpyArr);
    }

    static int[] splitMerge(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return merge(splitMerge(left), splitMerge(right));
    }

    static int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] mergedArr = new int[length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < length; k++) {
            if (j == right.length || (i < left.length && left[i] < right[j])) {
                mergedArr[k] = left[i];
                i++;
            } else {
                mergedArr[k] = right[j];
                j++;
            }
        }

        return mergedArr;
    }
}
