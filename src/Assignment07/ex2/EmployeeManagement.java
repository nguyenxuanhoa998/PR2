package Assignment07.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class EmployeeManagement {
    private Set<Employee> employees = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        while (true) {
            System.out.println("Enter employee details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();

            Employee employee = new Employee(name, phoneNumber, email, department);
            if (employees.contains(employee)) {
                System.out.println("Error: Employee already exists.");
            } else {
                employees.add(employee);
                System.out.println("Employee added successfully.");
            }

            System.out.print("Do you want to add another employee? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }

    public void removeEmployee() {
        System.out.print("Enter the name of the employee to remove: ");
        String name = scanner.nextLine();
        employees.removeIf(emp -> emp.getName().equalsIgnoreCase(name));
        System.out.println("Employee removed if existed.");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        employees.forEach(System.out::println);
    }

    public void searchByDepartment() {
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        employees.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .forEach(System.out::println);
    }

    public void findEmployeeMaxPhoneNumber() {
        Employee maxEmployee = employees.stream().max(Comparator.comparing(Employee::getPhoneNumber)).orElse(null);
        if (maxEmployee != null) {
            System.out.println("Employee with highest phone number: " + maxEmployee);
        } else {
            System.out.println("No employees found.");
        }
    }

    public void sortEmployeesByName() {
        List<Employee> sortedList = new ArrayList<>(employees); // Chuyển HashSet thành List để sắp xếp
        sortedList.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER));

        if (sortedList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Sorted Employee List:");
            for (Employee e : sortedList) {
                System.out.println(e);
            }
        }
    }


    public void saveToFile() {
        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Employee emp : employees) {
                writer.println(emp);
            }
            System.out.println("Employee list saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagement system = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Search by Department");
            System.out.println("5. Find Employee with Highest Phone Number");
            System.out.println("6. Sort Employees by Name");
            System.out.println("7. Save to File");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: system.addEmployee(); break;
                case 2: system.removeEmployee(); break;
                case 3: system.displayEmployees(); break;
                case 4: system.searchByDepartment(); break;
                case 5: system.findEmployeeMaxPhoneNumber(); break;
                case 6: system.sortEmployeesByName(); break;
                case 7: system.saveToFile(); break;
                case 8: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid option!");
            }
        }
    }
}
