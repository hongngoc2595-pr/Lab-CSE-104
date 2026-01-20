import java.util.Scanner;

public class birth {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long B = sc.nextLong();
            long R = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();
            long costGreen = (Math.min(X, Y + Z));
            long costRed = (Math.min(Y, X + Z));
            long payment = B * costGreen + R * costRed;
 
            System.out.println(payment);
        }
    }
}
