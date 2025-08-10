package CodeCombat;

import java.util.Scanner;

public class jk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        // Khởi tạo mảng
        int[] arr = new int[n];

        // Nhập từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // In ra mảng
        System.out.print("Các phần tử đã nhập: ");
        for (int x : arr) {
            System.out.print(x + " ");//
        }
    }
}
