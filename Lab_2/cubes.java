import java.util.Scanner;

public class cubes {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalbricks = sc.nextInt();
        int layer = 1;
        while (totalbricks >= layer * (layer + 1) / 2) {
            totalbricks -= layer * (layer + 1) / 2;
            layer++;
        }
        System.out.println(layer - 1);
    }
 
}
