
import java.util.Scanner;

public class banksfee2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalfee = 0;
        long totalcheck = 0;
        for (int i = 0; i < n; i++) {
            double money = sc.nextDouble();
            long check = sc.nextLong();
            double month = 0;
            double checkfee = 0;
            if (money < 500) {
                month = 12.00;
                checkfee = 0.20;
            } else if (money < 2000) {
                month = 7.5;
                checkfee = 0.20;
            } else if (money < 5000) {
                month = 5.00;
                checkfee = 0.10;
            } else {
                month = 0;
                checkfee = 0;
            }
            double total = month + checkfee * check;
            totalfee += total;
            totalcheck += check;
        }
        System.out.printf("%.3f", totalfee / totalcheck);

    }

}
