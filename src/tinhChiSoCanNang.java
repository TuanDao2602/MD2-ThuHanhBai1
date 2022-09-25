import java.util.Scanner;

public class tinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height , bmi;
        System.out.print("nhập vào cân nặng của bạn (kg): ");
        weight =  scanner.nextDouble();
        System.out.print("nhập vào chiều cao của bạn (met)");
        height = scanner.nextDouble();
        bmi = weight /(height*height);
        System.out.printf("%-20s%s", "bmi","Interpretation\n");
        if (bmi<18)
            System.out.printf("%-20.2f%s",bmi, "Underweight");
        else if (bmi<25.0)
            System.out.printf("%-20.2f%s",bmi, "Normal");
        else if (bmi<30.0)
            System.out.printf("%-20.2f%s",bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s",bmi, "Obese");

    }
}
