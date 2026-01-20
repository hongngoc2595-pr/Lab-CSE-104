import java.util.Scanner;

public class snail {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();
        int result = (int) (1 + Math.ceil((double) (V - A) / (A - B)));
        System.out.println(result);
 
    }
}
