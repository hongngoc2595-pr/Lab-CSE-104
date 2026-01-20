import java.util.Scanner;
public class maxdifnum {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long minVal = a[0];
        long maxDif = 0;
        for (int i = 1; i < a.length; i++) {
            if (minVal > a[i]) {
                minVal = a[i];
            }
            long curDif = a[i] - minVal;
            if (curDif > maxDif) {
                maxDif = curDif;
            }
        }
        System.out.println(maxDif);
    }
}
