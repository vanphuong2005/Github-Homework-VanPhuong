import java.awt.*;
import java.util.Scanner;

public class BaiThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số :");
        int number = sc.nextInt();
        while (number < 0) {
            System.out.println("Vui lòng nhập lại !");
            System.out.println("Nhập số:");
            number = sc.nextInt();
        }
        int so = number;
        int SoLonNhat = 0;
        while (so > 0) {
            int SoHienTai = so % 10;
            if (SoHienTai > SoLonNhat) {
                SoLonNhat = SoHienTai;
            }
            so = so / 10;
        }
        System.out.println("Số lớn nhất là " + SoLonNhat);
    }
}
