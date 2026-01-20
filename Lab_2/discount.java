import java.util.Scanner;

public class discount {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double total = 0;
        double[] money = new double[] {
                2000000, 10000000, 50000000, 100000000, 200000000, 500000000, Long.MAX_VALUE
        };
        double[] discount = new double[] {
                0.03, 0.05, 0.07, 0.1, 0.12, 0.15
        };
        for (int i = 0; i < discount.length; i++) {
            if (n > money[i]) {
                total += Math.min((money[i + 1] - money[i]), (n - money[i])) * discount[i];
            }
        }
        System.out.println(Math.round(n - total));
    }
 
} 
