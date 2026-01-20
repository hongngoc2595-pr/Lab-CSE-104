import java.util.Arrays;
import java.util.Scanner;

public class numberoftriangles {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (a[left] + a[right] > a[i]) {
                    count += (right - left);
                    right--;
                } else {
                    left++;
                }
 
            }
        }
 
        System.out.println(count);
    }
 
}
