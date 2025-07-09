package Assignment11;

public class main {
    public static void main(String[] args) {
        try {
            ProductDAO productDAO = new ProductDAO();

            // Adding products
            productDAO.add(new Product("Laptop", 1000));
            productDAO.add(new Product("Phone", 500));
            productDAO.add(new Product("Tablet", 300));

            // Display all products
            System.out.println("All Products: " + productDAO.getList());

            // Finding a product
            Product foundProduct = productDAO.find("Phone");
            System.out.println("Found Product: " + (foundProduct != null ? foundProduct : "Not Found"));

            // Updating a product
            productDAO.update(new Product("Tablet", 500));
            System.out.println("After Update: " + productDAO.getList());

            // Removing a product
            productDAO.remove(foundProduct);
            System.out.println("After Removal: " + productDAO.getList());
            Product c = new Product("Sam sung" , 20);
            // Finding a non-existent product
            Product notFoundProduct = productDAO.find( c);
            System.out.println("Non-existent Product: " + (notFoundProduct != null ? notFoundProduct : "Not Found"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
