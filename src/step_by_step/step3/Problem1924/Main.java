// https://www.acmicpc.net/problem/1924

package step_by_step.step3.Problem1924;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date inputDate = simpleDateFormat.parse("2007-" + x + "-" + y);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputDate);

            switch (calendar.get(Calendar.DAY_OF_WEEK)) {
                case 1:
                    System.out.print("SUN");
                    break;
                case 2:
                    System.out.print("MON");
                    break;
                case 3:
                    System.out.print("TUE");
                    break;
                case 4:
                    System.out.print("WED");
                    break;
                case 5:
                    System.out.print("THU");
                    break;
                case 6:
                    System.out.print("FRI");
                    break;
                case 7:
                    System.out.print("SAT");
                    break;
            }

        } catch (ParseException e) {
            System.out.println("Error");
        }
    }
}
