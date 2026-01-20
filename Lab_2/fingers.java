import java.util.Scanner;

public class fingers {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String hand = "";
        int result = n % 18;
        if (result == 0) {
            result = 18;
        }
        if (result > 10) {
            result = 20 - result;
        }
        if (result > 5) {
            hand = "cua ban tay phai";
        } else {
            hand = "cua ban tay trai";
            result = 11 - result;
        }
        if (result == 1 || result == 10) {
            System.out.print("Ngon cai " + hand);
        } else if (result == 2 || result == 9) {
            System.out.print("Ngon tro " + hand);
        } else if (result == 3 || result == 8) {
            System.out.print("Ngon giua " + hand);
        } else if (result == 4 || result == 7) {
            System.out.print("Ngon ap ut " + hand);
        } else if (result == 5 || result == 6) {
            System.out.print("Ngon ut " + hand);
        }
    }
}
