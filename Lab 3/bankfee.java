
import java.util.Scanner;

public class bankfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n là số dư tài khoản, dùng double vì có thể có số thập phân
        //  dùng int vì mất phần lẻ
        double n = sc.nextDouble();
        // check là số lượng séc là số đếm nên dùng int
        int check = sc.nextInt();
        // month là phí tháng có giá trị thập phân nên dùng double
        double month = 0;
        // checkfee là phí trên mỗi sec 
        // có thể là số thập phân nên dùng double
        double checkfee = 0;
        if (n < 500) {
            month = 12.00;
            checkfee = 0.20;
        } else if (n < 2000) {
            month = 7.5;
            checkfee = 0.20;
        } else if (n < 5000) {
            month = 5.00;
            checkfee = 0.10;
        } else {
            month = 0;
            checkfee = 0;
        }
        // total là tổng phải trả trong tháng
        // kết quả có thể âm nên dùng double 
        double total = month + checkfee * check;
        // kiểm tra xem total có phải số nguyên không
        // ép total sag long để so sánh
        if( total == (long) total)
            // nếu là số nguyên thì in ra không có phần thập phân
            System.out.println(String.format("%d\n", (long) total));
        else
            // nếu có phần lẻ thì in trực tiếp
            System.out.println(total);

    }

}
