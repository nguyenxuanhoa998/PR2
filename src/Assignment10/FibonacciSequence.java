package Assignment10;

import java.util.Scanner;

public class FibonacciSequence {
    public static void getFibonacci(int n){
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        System.out.println( (int)Math.round(Math.pow(phi, n) / sqrt5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getFibonacci(n);
    }

}