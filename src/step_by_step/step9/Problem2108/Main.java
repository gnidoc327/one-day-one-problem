// https://www.acmicpc.net/problem/2108

package step_by_step.step9.Problem2108;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//      input
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

//        test code
//        int[] arr = {1, 3, 8, -2, 2};
//        int[] arr = {4000};
//        int[] arr = {-1, -2, -3, -1, -2};
//        int[] arr = new int[500000];
//        for (int i = 0; i < 500000; i++) {
//            arr[i] = i % 4000;
//        }

        solve(arr);
    }

    static void solve(int[] arr) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = arr.length;
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int max = -4001;
        int min = 4001;
        for (int i : arr) {
            sum += i;
            if (hashMap.get(i) == null) {
                hashMap.put(i, 0);
            } else {
                hashMap.put(i, hashMap.get(i) + 1);
            }
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int range = max - min;

        float avg = (((float) sum / n) * 10) / 10;
        bufferedWriter.write(Math.round(avg) + "\n");

        Arrays.sort(arr);
        bufferedWriter.write(arr[n / 2] + "\n");

        ArrayList<Integer> maxKeyArrayList = new ArrayList<>();
        max = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
                maxKeyArrayList.clear();
                maxKeyArrayList.add(entry.getKey());
            } else if (count == max) {
                maxKeyArrayList.add(entry.getKey());
            }
        }
        Integer[] keyArr = new Integer[maxKeyArrayList.size()];
        keyArr = maxKeyArrayList.toArray(keyArr);
        Arrays.sort(keyArr);
        if (keyArr.length > 1) {
            bufferedWriter.write(keyArr[1] + "\n");
        } else {
            bufferedWriter.write(keyArr[0] + "\n");
        }

        bufferedWriter.write(range + "\n");
        bufferedWriter.flush();
    }
}

