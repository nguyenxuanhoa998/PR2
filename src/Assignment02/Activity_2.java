package Assignment02;

import java.util.Scanner;
public class Activity_2 {

    public static void main( String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Change Counter!");
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        double total = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

        System.out.printf("You have $%.2f in total.%n", total);

        scanner.close();
    }
}
