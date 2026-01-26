import java.util.Scanner;

public class sale {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sale = sc.nextDouble();
        double bonus = 0;
        if (sale <= 20) {
            bonus = sale * 0.02;
        } else if (sale <= 50) {
            bonus = (20 * 0.02) + (sale - 20) * 0.03;
        } else if (sale <= 200) {
            bonus = (20 * 0.02) + (50 - 20) * 0.03 + (sale - 50) * 0.04;
        } else if (sale <= 500) {
            bonus = (20 * 0.02) + (50 - 20) * 0.03 + (200 - 50) * 0.04 + (sale - 200) * 0.05;
        } else if (sale <= 2000) {
            bonus = (20 * 0.02) + (50 - 20) * 0.03 + (200 - 50) * 0.04 + (500 - 200) * 0.05 + (sale - 500) * 0.06;
        } else {
            bonus = (20 * 0.02) + (50 - 20) * 0.03 + (200 - 50) * 0.04 + (500 - 200) * 0.05 + (2000 - 500) * 0.06
                    + (sale - 2000) * 0.07;
        }
        System.out.println(Math.round(bonus*1000)/1000d);
 
    }
}
