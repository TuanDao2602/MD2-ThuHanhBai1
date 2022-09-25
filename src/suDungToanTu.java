import java.util.Scanner;

public class suDungToanTu {
    public static void main(String[] args) {
        float width; // khai báo biến kiểu số thực , chiều dài , chiều rộng
        float height;
        Scanner scanner= new Scanner(System.in); //khai báo đối tượng scaner để thực hiện chức năng nhập dữ liê trong java core
        System.out.println(" nhập vào chiều dài");
        width = scanner.nextFloat();
        System.out.println("nhập chiều cao");
        height = scanner.nextFloat();
        float arena = width*height; // khai báo biến arena để tính diện tích
        System.out.println("area is " + arena);



    }
}
