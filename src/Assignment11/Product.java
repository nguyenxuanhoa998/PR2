package Assignment11;

import java.io.*;

import utils.NotPossibleException;

public class Product implements Serializable {
    private String name ;
    private double price;
    private static final int NAME_LENGTH = 50;
    private static final double MIN_PRICE = 0 ;
    private final long serialVersionUID= 1L;
    public Product(String name , double price ){
        if(!isValidName(name)){
            throw new NotPossibleException("Product name must be between 1 and 50 characters and cannot be empty.");
        }
        if(!isValidPrice(price)){
            throw new NotPossibleException("Product price must be non-negative.");
        }
        this.name=name.trim();
        this.price= price;
    }
    public  String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void  setName(String name){
        if(!isValidName(name)){
            throw new NotPossibleException(" NotPossibleException: setter - Product name must be between 1 and 50 characters and cannot be empty.");
        }
         this.name=name.trim() ;
    }
    public void setPrice(double price){
        if(!isValidPrice(price))
            throw new NotPossibleException("NotPossibleException: setter - Product price must be non-negative.");
         this.price=price;
    }
    public boolean isValidName(String name){
        return name !=null && !name.isEmpty() && name.length() <= NAME_LENGTH ;
    }
    public boolean isValidPrice(double price){
        return price >= MIN_PRICE ;
    }
    public String toString(){
        return "Product[{"+ "name=" + name + ", price=" + price +"}]";
    }

    public static void main(String[] args) {
        System.out.println("Running test cases for Product class");
        // Valid Product Creation
        try {
            Product validProduct = new Product("Laptop", 999.99);
            System.out.println("Valid product created " + validProduct);
        } catch (Exception e) {
            System.out.println("Failed " + e.getMessage());
        }

        // Empty Name Invalid Case
        try {
            Product invalidProduct1 = new Product("", 500);
            System.out.println("Should not succeed " + invalidProduct1);
        } catch (Exception e) {
            System.out.println("Caught expected error " + e.getMessage());
        }

        // Name exceeding 50 characters Invalid Case
        try {
            Product invalidProduct2 = new Product("This Product Name Is Way Too Long And Should Fail Validation", 150);
            System.out.println("Should not succeed " + invalidProduct2);
        } catch (Exception e) {
            System.out.println("Caught expected error " + e.getMessage());
        }

        // Negative Price Invalid Case
        try {
            Product invalidProduct3 = new Product("TV", -100);
            System.out.println("Should not succeed " + invalidProduct3);
        } catch (Exception e) {
            System.out.println("Caught expected error " + e.getMessage());
        }

        // Zero Price Valid Case
        try {
            Product freeProduct = new Product("Free Gift", 0);
            System.out.println("Zero price product created " + freeProduct);
        } catch (Exception e) {
            System.out.println("Failed " + e.getMessage());
        }

        // Name with Leading and Trailing Spaces Valid Case
        try {
            Product trimmedNameProduct = new Product("   Smartphone   ", 750);
            System.out.println("Trimmed name product created " + trimmedNameProduct);
        } catch (Exception e) {
            System.out.println("Failed " + e.getMessage());
        }

        // Updating Product Name to an Invalid Value
        try {
            Product updateTest = new Product("Tablet", 300);
            System.out.println("Initial product " + updateTest);
            updateTest.setName("");
            System.out.println("Should not succeed " + updateTest);
        } catch (Exception e) {
            System.out.println("Caught expected error " + e.getMessage());
        }

        // Updating Product Price to a Negative Value Invalid Case
        try {
            Product updateTest2 = new Product("Monitor", 250);
            System.out.println("Initial product " + updateTest2);
            updateTest2.setPrice(-50);
            System.out.println("Should not succeed " + updateTest2);
        } catch (Exception e) {
            System.out.println("Caught expected error " + e.getMessage());
        }

        // Serialization and Deserialization Test
        try {
            Product originalProduct = new Product("Smart Watch", 199.99);
            String filename = "./demo/product.ser";

            // Serialize Product
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(originalProduct);
            out.close();
            fileOut.close();
            System.out.println("Product serialized successfully");

            // Deserialize Product
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Product deserializedProduct = (Product) in.readObject();
            in.close();
            fileIn.close();

            // Check if deserialized object matches original
            if (originalProduct.toString().equals(deserializedProduct.toString())) {
                System.out.println("Serialization test passed " + deserializedProduct);
            } else {
                System.out.println("Serialization test failed");
            }
        } catch (Exception e) {
            System.out.println("Serialization test error " + e.getMessage());
        }

        System.out.println("Test cases execution completed");
}
}