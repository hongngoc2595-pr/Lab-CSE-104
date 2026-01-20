import java.util.Scanner;

public class discount2 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long pay = 0;
        if (n > 900_000_000L) {
            pay += (long) ((n - 900_000_000L) * 0.85);
            n = 900_000_000L;
        }
        if (n > 600_000_000L) {
            pay += (long) ((n - 600_000_000L) * 0.88);
            n = 600_000_000L;
        }
        if (n > 300_000_000L) {
            pay += (long) ((n - 300_000_000L) * 0.90);
            n = 300_000_000L;
        }
        if (n > 100_000_000L) {
            pay += (long) ((n - 100_000_000L) * 0.93);
            n = 100_000_000L;
        }
        if (n > 20_000_000L) {
            pay += (long) ((n - 20_000_000L) * 0.95);
            n = 20_000_000L;
        }
        if (n > 5_000_000L) {
            pay += (long) ((n - 5_000_000L) * 0.97);
            n = 5_000_000L;
        }
        pay += n;
        System.out.println(pay);
    }
}
