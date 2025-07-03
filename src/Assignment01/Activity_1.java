package Assignment01;

import java.util.Scanner;

public class Activity_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tên từ người dùng
        System.out.println("Enter the characters:");
        String name = sc.nextLine();

        // Chuẩn hóa tên thành chữ hoa
        String capName = name.toUpperCase();

        // In các ký tự theo yêu cầu
        for (int i = 0; i < capName.length(); i++) {
            char initial = capName.charAt(i);
            printInitial(initial);
        }
    }

    public static void printInitial(char initial) {
        switch (initial) {
            case 'D':
                printD();
                break;
            case 'J':
                printJ();
                break;
            case 'E':
                printE();
                break;
            default:
                System.out.println("Character not defined: " + initial);
        }
    }

    public static void printD() {
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
        System.out.println();
    }

    public static void printJ() {
        System.out.println("***************");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" *****");
        System.out.println();
    }

    public static void printE() {
        System.out.println("*******");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*****");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*******");
        System.out.println();
    }
}
