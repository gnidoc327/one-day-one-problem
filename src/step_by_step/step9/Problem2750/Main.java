// https://www.acmicpc.net/problem/2750

package step_by_step.step9.Problem2750;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        test code
//        int[] arr = {5, 2, 3, 4, 1};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {5, 4, 3, 2, 1};
//        int[] arr = {1, 1, 1, 2, 3};
//        int[] arr = {1, 2, 1, 1, 3};
//        int[] arr = {1, 3, 1, 1, 2};
//        int[] arr = {3, 2, 1, 1, 1};

//        1. Arrays.sort
//        Arrays.sort(arr);
//        for (int num : arr) {
//            System.out.println(num);
//        }


//        2. bubble sort
//        for (int num : bubbleSort(arr)) {
//            System.out.println(num);
//        }

//        3. insert sort
        for (int num : insertSort(arr)) {
            System.out.println(num);
        }
    }

//    static int[] bubbleSort(int[] src) {
//        int[] cpyArr = src.clone();
//
//        for (int i = 0; i < cpyArr.length; i++) {
//            for (int j = 0; j < cpyArr.length - 1; j++) {
//                if (cpyArr[j] > cpyArr[j + 1]) {
//                    int temp = cpyArr[j];
//                    cpyArr[j] = cpyArr[j + 1];
//                    cpyArr[j + 1] = temp;
//                }
//            }
//        }
//
//        return cpyArr;
//    }

    static int[] insertSort(int[] src) {
        int[] cpyArr = src.clone();

        for (int i = 1; i < cpyArr.length; i++) {
            for (int j = 0; j < cpyArr.length; j++) {
                if (i != j && cpyArr[i] < cpyArr[j]) {
                    int temp = cpyArr[i];
                    cpyArr[i] = cpyArr[j];
                    cpyArr[j] = temp;
                }
            }
        }

        return cpyArr;
    }
}
