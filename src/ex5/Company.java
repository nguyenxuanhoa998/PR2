package ex5;
import java.util.ArrayList;
import java.util.List;
public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int workA, int workB) {
        employees.add(new Employee(workA, workB));
    }

    public int findMinimumTime() {
        int minTime = Integer.MAX_VALUE;
        int N = employees.size();

        // Trường hợp giao cả hai công việc cho một nhân viên
        for (Employee e : employees) {
            minTime = Math.min(minTime, e.getTotalTime());
        }

        // Trường hợp chia hai công việc cho hai nhân viên khác nhau
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    int time = Math.max(employees.get(i).getWorkA(), employees.get(j).getWorkB());
                    minTime = Math.min(minTime, time);
                }
            }
        }

        return minTime;
    }
}
