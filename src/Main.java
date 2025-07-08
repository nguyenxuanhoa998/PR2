import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "Test.txt"; // 🔄 Đã đổi thành tên file bạn yêu cầu
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }

            if (content.toString().contains("HANU")) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }

        } catch (IOException e) {
            System.out.println("Không thể đọc file: " + e.getMessage());
        }
    }
}
