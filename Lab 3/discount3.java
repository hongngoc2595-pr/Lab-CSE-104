import java.util.Scanner;

public class discount3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int online = sc.nextInt();
        int vip = sc.nextInt();
        int card = sc.nextInt();
        long current = money;
        long discount = 0;
        long origin = current;
        if (origin > 900_000_000) {
            discount += (origin - 900_000_000) * 15 / 100;
            origin = 900_000_000;
        }
        if (origin > 600_000_000) {
            discount += (origin - 600_000_000) * 12 / 100;
            origin = 600_000_000;
        }
        if (origin > 300_000_000) {
            discount += (origin - 300_000_000) * 10 / 100;
            origin = 300_000_000;
        }
        if (origin > 100_000_000) {
            discount += (origin - 100_000_000) * 7 / 100;
            origin = 100_000_000;
        }
        if (origin > 20_000_000) {
            discount += (origin - 20_000_000) * 5 / 100;
            origin = 20_000_000;
        }
        if (origin > 5_000_000) {
            discount += (origin - 5_000_000) * 3 / 100;
        }
        current -= discount;
        if (online == 1) {
            current = current * 98 / 100;
        }
        if (vip == 1) {
            current = current * 98 / 100;
        }
        if (card == 1) {
            current = current * 98 / 100;
        }
        System.out.println((long)current);
 
    }
}
