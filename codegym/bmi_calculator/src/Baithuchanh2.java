import java.util.Scanner;

public class Baithuchanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số :");
        int number = sc.nextInt();
        while (number < 0) {
            System.out.println("Vui lòng nhập lại !");
            System.out.println("Nhập số:");
            number = sc.nextInt();
        }
        if(number < 0){
            return;
        }
        if(number >= 0 && number <= 9){
            System.out.println("Là số đối xứng");
            return;
        }
        int Thuan = number;
        int Nguoc = 0;
        while (Thuan > 0){
            int Chusocuoi = Thuan % 10;
            Nguoc = Nguoc * 10 + Chusocuoi;// Nguoc += Nguoc
            Thuan = Thuan / 10;
        }
        if(number==Nguoc){
            System.out.println(number+"là số đối xứng");
        }else {
            System.out.println(number+"không phải số dối xứng");
        }
    }
}
