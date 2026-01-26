
import java.util.Scanner;

public class bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        int costs = 200;
        long total = 0;
        while (products > 0) {
            int count = Math.min(100, products);
            if (costs < 180) {
                costs = 180;
            }
            total += (long) count * costs;
            products -= count;
            costs--;

        }
        System.out.println(total);
    }

}
