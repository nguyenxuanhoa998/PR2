package Assignment07.ex2;
import java.util.*;

class Employee {
    private String name;
    private String phoneNumber;
    private String email;
    private String department;
    private int ID ;
    public Employee(String name, String phoneNumber, String email, String department) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return name.equals(employee.name) && phoneNumber.equals(employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email + ", Department: " + department;
    }
}

