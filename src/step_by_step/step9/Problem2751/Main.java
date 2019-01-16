// https://www.acmicpc.net/problem/2751

package step_by_step.step9.Problem2751;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

//        test code
        int[] arr = {2, 3, 4, 1};
//        int[] arr = {5, 2, 3, 4, 1};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {5, 4, 3, 2, 1};
//        int[] arr = {1, 1, 1, 2, 3};
//        int[] arr = {1, 2, 1, 1, 3};
//        int[] arr = {1, 3, 1, 1, 2};
//        int[] arr = {3, 2, 1, 1, 1};


//        2. merge sort
        for (int num : mergeSort(arr)) {
            System.out.println(num);
        }

//        3. heap sort
//        for (int num : insertSort(arr)) {
//            System.out.println(num);
//        }
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
        int mid = left.length;
        int[] mergedArr = new int[length];
        int i = 0;
        int j = length - 1;

        // TODO
        for (int k = 0; k < length; k++) {
            if (k < mid) {
                mergedArr[k] = left[k];
            } else {
                mergedArr[k + mid] = right[k - mid];
            }
        }
        return mergedArr;
    }

//    static int[] heapSort(int[] src) {
//        int[] cpyArr = src.clone();
//
//
//        return cpyArr;
//    }
}
