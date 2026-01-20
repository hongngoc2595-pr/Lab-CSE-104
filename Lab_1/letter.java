import java.util.Scanner;

public class letter {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int i = 1;
        int same = 0;
        while (i <= a.length() && i <= b.length()) {
            if (a.substring(a.length() - i).equals(b.substring(0, i))) {
                same = i;
            }
            i++;
        }
        System.out.println(a.length() + b.length() - same);
    }
 
}
