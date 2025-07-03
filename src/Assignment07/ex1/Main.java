package Assignment07.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Xóa sinh viên theo tên");
            System.out.println("5. Sắp xếp sinh viên theo điểm giảm dần");
            System.out.println("6. Tính điểm trung bình của danh sách");
            System.out.println("7. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("8. Cập nhật điểm sinh viên theo tên");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Tránh trôi dòng

            switch (choice) {
                case 1:
                    manager.enterStudentNames();
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String searchName = scanner.nextLine();
                    manager.searchStudentByName(searchName);
                    break;
                case 4:
                    System.out.print("Nhập tên sinh viên cần xóa: ");
                    String removeName = scanner.nextLine();
                    manager.removeStudentByName(removeName);
                    break;
                case 5:
                    manager.sortStudentsByGrade();
                    break;
                case 6:
                    System.out.println("Điểm trung bình của danh sách: " + manager.calculateAverageGrade());
                    break;
                case 7:
                    manager.displayTopStudent();
                    break;
                case 8:
                    System.out.print("Nhập tên sinh viên cần cập nhật điểm: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Nhập điểm mới: ");
                    double newGrade = scanner.nextDouble();
                    scanner.nextLine();  // Tránh trôi dòng
                    manager.updateStudent(updateName, newGrade);
                    break;
                case 9:
                    System.out.println("Thoát chương trình...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
