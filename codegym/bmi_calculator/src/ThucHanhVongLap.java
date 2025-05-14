import java.util.Scanner;
public class ThucHanhVongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhập số :");
        int number = sc.nextInt();
        while (number < 0){
            System.out.println("Yêu cầu nhập lại !");
            System.out.print("Hay nhập số :");
            number = sc.nextInt();
        }
        int Thuan = number;
        int Nguoc = 0;
        while (Thuan > 0){
            int Chusocuoi = Thuan % 10;
            Nguoc = Nguoc * 10 + Chusocuoi;// Nguoc += Nguoc
            Thuan = Thuan / 10;

        }
        System.out.println("Kết quả là:"+ Nguoc);
    }
}
