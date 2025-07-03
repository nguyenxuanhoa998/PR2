package Assignment03;

import java.util.Scanner;

public class Ex4Product {
    private String name;
    private double price;
    private double discount;

    // Constructor
    public Ex4Product() {
    }

    // Nhập thông tin từ bàn phím
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Product Name: ");
        this.name = sc.nextLine();
        System.out.print("Unit price: ");
        this.price = sc.nextDouble();
        System.out.print("Discount: ");
        this.discount = sc.nextDouble();
    }

    // Tính thuế nhập khẩu
    public double getImportTax() {
        return this.price * 10 / 100;
    }

    // Hiển thị thông tin sản phẩm
    public void display() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Unit Price: " + this.price);
        System.out.println("Discount: " + this.discount);
        System.out.println("Import Tax: " + getImportTax());
    }
}

