// https://www.acmicpc.net/problem/1427

package step_by_step.step9.Problem1427;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        solve(n);

//        test code
//        solve(2143);
//        solve(1);
//        solve(12);
//        solve(1000000000);
//        solve(123456789);
    }

    static void solve(int n) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (n != 0) {
            arrayList.add(n % 10);
            n /= 10;
        }

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        for (int i : arrayList) {
            bufferedWriter.write(String.valueOf(i));
        }
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }
}

