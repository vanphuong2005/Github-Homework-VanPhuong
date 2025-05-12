import java.util.Scanner;
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số kWh đã dùng:");
        int kWh = scanner.nextInt();
        double tongTien = 0;
        if (kWh <= 50) {
            tongTien = kWh * 1800;
        } else if (kWh <= 100) {
            tongTien = 50 * 1800 + (kWh - 50) * 2300;
        } else {
            tongTien = 50 * 1800 + 50 * 2300 + (kWh - 100) * 3000;
        }
        System.out.print("Tong Tien Thang Nay: " + tongTien);
    }
}
