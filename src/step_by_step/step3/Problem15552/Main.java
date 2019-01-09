// https://www.acmicpc.net/problem/15552

package step_by_step.step3.Problem15552;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = bufferedReader.readLine();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String inputStr = bufferedReader.readLine();
            String[] ab = inputStr.split(" ");
            int result = Integer.parseInt(ab[0]) + Integer.parseInt(ab[1]);
            bufferedWriter.write(result + "\n");
        }

        bufferedWriter.flush();
    }
}
