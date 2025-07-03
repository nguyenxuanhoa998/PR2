package Assignment03;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double discount;

    // Constructor 1: Nhận đủ 3 tham số (có giảm giá)
    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Constructor 2: Chỉ nhận name và price, discount mặc định là 0 (không có giảm giá)
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Nhập thông tin sản phẩm từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        this.name = sc.nextLine();
        System.out.print("Enter unit price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter discount: ");
        this.discount = sc.nextDouble();
    }

    // Tính thuế nhập khẩu (private)
    private double getImportTax() {
        return this.price * 0.1;
    }

    // Hiển thị thông tin sản phẩm (public)
    public void display() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Unit Price: " + this.price);
        System.out.println("Discount: " + this.discount);
        System.out.println("Import Tax: " + getImportTax());
    }
}
