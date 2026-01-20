import java.util.Scanner;

public class cube2 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            long n = sc.nextLong();
            long left = 0;
            long right = 2_000_000;
            long res = 0;
            while (left <= right) { 
                long mid = (left + right) / 2;
                if (bricks(mid) <= n) {
                   res = mid; 
                    left = mid+1;
                } else {
                    right = mid -1; 
                    
                }
            }
 
            System.out.print(res);
            if (i < k - 1) {
                System.out.print(" ");
            }
 
        }
    }
    static long bricks(long h){
        return h*(h+1) * (h+2)/6;
 
    }
}
