package Assignment07.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    // 1. Nhập danh sách sinh viên
    public void enterStudentNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int numStudents;

        while (true) {
            if (scanner.hasNextInt()) {
                numStudents = scanner.nextInt();
                if (numStudents > 0) break;
            }
            System.out.print("Số lượng không hợp lệ! Nhập lại: ");
            scanner.nextLine(); // Xóa dòng bị lỗi
        }
        scanner.nextLine(); // Tránh lỗi trôi dòng

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = scanner.nextLine();

            System.out.print("Tuổi: ");
            int age;
            while (true) {
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age > 0) break;
                }
                System.out.print("Tuổi không hợp lệ! Nhập lại: ");
                scanner.nextLine(); // Xóa dòng bị lỗi
            }

            System.out.print("Điểm: ");
            double grade;
            while (true) {
                if (scanner.hasNextDouble()) {
                    grade = scanner.nextDouble();
                    if (grade >= 0 && grade <= 10) break;
                }
                System.out.print("Điểm không hợp lệ! Nhập lại: ");
                scanner.nextLine(); // Xóa dòng bị lỗi
            }
            scanner.nextLine(); // Tránh lỗi trôi dòng sau nextDouble()

            studentList.add(new Student(name, age, grade));
        }
    }

    // 2. Hiển thị danh sách sinh viên
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("Danh sách sinh viên:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // 3. Tìm kiếm sinh viên theo tên
    public void searchStudentByName(String name) {
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có tên: " + name);
    }

    // 4. Xóa sinh viên theo tên
    public void removeStudentByName(String name) {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        boolean removed = studentList.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Đã xóa sinh viên có tên: " + name);
        } else {
            System.out.println("Không tìm thấy sinh viên có tên: " + name);
        }
    }

    // 5. Sắp xếp danh sách sinh viên theo điểm giảm dần
    public void sortStudentsByGrade() {
        studentList.sort((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()));
        System.out.println("Danh sách sinh viên đã được sắp xếp theo điểm giảm dần.");
    }

    // 6. Tính điểm trung bình của danh sách sinh viên
    public double calculateAverageGrade() {
        if (studentList.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Student student : studentList) {
            sum += student.getGrade();
        }
        return sum / studentList.size();
    }

    // 7. Hiển thị sinh viên có điểm cao nhất
    public void displayTopStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGrade() > topStudent.getGrade()) {
                topStudent = student;
            }
        }
        System.out.println("Sinh viên có điểm cao nhất: " + topStudent);
    }

    // 8. Cập nhật điểm sinh viên theo tên
    public void updateStudent(String name, double newGrade) {
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.setGrade(newGrade);
                System.out.println("Cập nhật điểm thành công cho " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có tên: " + name);
    }
}
