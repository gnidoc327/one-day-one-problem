// https://www.acmicpc.net/problem/1181

package step_by_step.step9.Problem1181;


import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(bufferedReader.readLine());
        }

//        test code
//        String[] strs = new String[]{"but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im", "yours"};
//        String[] strs = new String[]{"b", "c", "a", "e", "f"};
//        String[] strs = new String[]{"aaaaa", "aaaa", "aaa", "aa", "a"};
//        arrayList = new ArrayList<>(Arrays.asList(strs));
        solve(arrayList);
    }

    static void solve(ArrayList<String> inputArrayList) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : inputArrayList) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }

        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                return o1.compareTo(o2);
            }
        });

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String str : arrayList) {
            bufferedWriter.write(str + "\n");
        }
        bufferedWriter.flush();
    }
}

