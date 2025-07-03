package Assignment03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin sản phẩm có giảm giá
        Product product1 = new Product("", 0, 0);
        System.out.println("Enter details for Product 1:");
        product1.input();  // Nhập từ bàn phím

        // Nhập thông tin sản phẩm không có giảm giá
        Product product2 = new Product("", 0);
        System.out.println("Enter details for Product 2:");
        product2.input();

        // Hiển thị thông tin sản phẩm
        System.out.println("Product 1 Information:");
        product1.display();

        System.out.println("Product 2 Information:");
        product2.display();

        sc.close();
    }
}
