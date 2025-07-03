package Assignment07.ex1;

public class UndergraduateStudent extends Student {
    private String major; // Chuyên ngành

    public UndergraduateStudent(String name, int age, double grade, String major) {
        super(name, age, grade);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
