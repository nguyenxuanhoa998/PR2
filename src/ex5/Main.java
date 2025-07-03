package ex5;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        int N = Integer.parseInt(br.readLine().trim());

        Company company = new Company();

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int workA = Integer.parseInt(line[0]);
            int workB = Integer.parseInt(line[1]);
            company.addEmployee(workA, workB);
        }
        br.close();

        int minTime = company.findMinimumTime();
        System.out.println(minTime);
    }
}
