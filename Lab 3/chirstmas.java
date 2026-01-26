import java.util.Scanner;

public class chirstmas {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for (int i = 0; i < n; i++) {
            long bill = sc.nextLong();
            double discount = 0;
 
            if (bill <= 2_000_000) {
                discount = 0.03;
            } else if (bill <= 5_000_000) {
                discount = 0.04;
            } else if (bill <= 10_000_000) {
                discount = 0.05;
            } else if (bill <= 20_000_000) {
                discount = 0.06;
            } else if (bill <= 50_000_000) {
                discount = 0.07;
            } else if (bill <= 100_000_000) {
                discount = 0.08;
            } else if (bill <= 200_000_000) {
                discount = 0.09;
            } else {
                discount = 0.10;
            }
            long afterdis = (Math.round(bill * (1 - discount)));
            total += afterdis;
        }
        System.out.println(total);
    }
}
