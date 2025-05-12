import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập cân nặng của bạn (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao của bạn (mét): ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s%n", "bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20.2f%s%n", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s%n", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s%n", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s%n", bmi, "Obese");
        }
        scanner.close();
    }
}
