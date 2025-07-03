package Assignment03;

public class Ex4Main {
    public static void main(String[] args) {
        // Tạo 2 đối tượng sản phẩm
        Ex4Product product1 = new Ex4Product();
        Ex4Product product2 = new Ex4Product();

        // Nhập dữ liệu cho từng sản phẩm
        System.out.println("Enter details for Product 1:");
        product1.input();

        System.out.println("Enter details for Product 2:");
        product2.input();

        // Hiển thị thông tin sản phẩm
        System.out.println("Product 1 Information:");
        product1.display();

        System.out.println("Product 2 Information:");
        product2.display();
    }
}