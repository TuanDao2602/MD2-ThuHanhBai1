import java.util.Scanner;

public class phuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Givena equation 'a * x + b = c, please enter contants");
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a: ");
        double a = scanner.nextDouble();
        System.out.println(" Enter b ");
        double b =scanner.nextDouble();
        System.out.println("Enter c ");
        double c = scanner.nextDouble();
        if (a != 0){
            double x =(c-b)/a;// phương triình có 1 nghiệm duyu nhất x= (c-b)/a
            System.out.println("Equation pass with x ="+x);
        }else {// trường hợp a =0;
            if (b==c){// nếu b =c phương trình có vô số nghiệm
                System.out.println("phương trình có vô số nghiệm");

            }else {// nếu b #c phương trình vô nghiệm
                System.out.println("Phương trình vô nghiệm");
            }

        }
    }
}
