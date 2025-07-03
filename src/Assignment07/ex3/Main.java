package Assignment07.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Product Management Menu ---");
            System.out.println("1. Enter product list");
            System.out.println("2. Sort by price (descending) and display");
            System.out.println("3. Find and delete a product by name");
            System.out.println("4. Export the average price");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of products: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter product price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        manager.addProduct(name, price);
                    }
                    break;
                case 2:
                    manager.displaySortedProducts();
                    break;
                case 3:
                    System.out.print("Enter the product name to delete: ");
                    String name = scanner.nextLine();
                    manager.deleteProduct(name);
                    break;
                case 4:
                    manager.calculateAveragePrice();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
