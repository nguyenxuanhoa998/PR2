package ex5;

public class Employee {
    private int workA;
    private int workB;

    public Employee(int workA, int workB) {
        this.workA = workA;
        this.workB = workB;
    }

    public int getWorkA() {
        return workA;
    }

    public int getWorkB() {
        return workB;
    }

    public int getTotalTime() {
        return workA + workB;
    }
}