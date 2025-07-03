package Assignment07.ex3;
import java.util.*;

public class ProductManager {
    private Map<String, Double> products = new HashMap<>();

    public void addProduct(String name, Double price) {
        products.put(name, price);
    }

    public void displaySortedProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        List<Product> productList = new ArrayList<>();
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            productList.add(new Product(entry.getKey(), entry.getValue()));
        }

        // Sắp xếp giảm dần theo giá
        productList.sort((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));

        System.out.println("\nSorted Product List:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void deleteProduct(String name) {
        if (products.containsKey(name)) {
            products.remove(name);
            System.out.println("Product '" + name + "' has been deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void calculateAveragePrice() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        double sum = products.values().stream().mapToDouble(Double::doubleValue).sum();
        double avg = sum / products.size();
        System.out.println("The average price of products: " + avg);
    }
}
