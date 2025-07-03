package Assignment07.ex1;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        if (age <= 0) {
            throw new IllegalArgumentException("The age of the student must be higher than 0.");
        }
        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Grade must be between 0 and 10.");
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double newGrade) {
        if (newGrade < 0 || newGrade > 10) {
            throw new IllegalArgumentException("Grade must be between 0 and 10.");
        }
        this.grade = newGrade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
