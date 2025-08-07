package StanFor_Mang;

import java.util.Scanner;

public class mang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ví dụ 1: Khai báo mảng số nguyên gồm 3 phần tử và gán giá trị
        int[] a = new int[4];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        a[3]=5;

        System.out.println(a.length);

        System.out.println("Các phần tử trong mảng a:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        // Nhập số phần tử cho mảng thực
        System.out.print("\nNhập số phần tử cho mảng thực: ");
        int n = sc.nextInt();

        // Khai báo mảng thực a2
        float[] a2 = new float[n];

        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a2[" + i + "] = ");
            a2[i] = sc.nextFloat();
        }

        System.out.printf("\nCác phần tử của mảng thực gồm %d phần tử:\n", n);
        for (int i = 0; i < a2.length; i++) {
            System.out.println("a2[" + i + "] = " + a2[i]);
        }

        sc.close(); // đóng scanner để tránh warning
    }
}
