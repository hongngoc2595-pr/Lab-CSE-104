import java.util.Scanner;

public class orderofthesquence {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        boolean ins = true;
        boolean des = true;
        for (int i = 1; i < num; i++) {
            if (a[i] <= a[i - 1]) {
                ins = false;
            }
            if (a[i] >= a[i - 1]) {
                des = false;
            }
        }
        if (ins) {
            System.out.println("increasing");
        } else if (des) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
    }
}
