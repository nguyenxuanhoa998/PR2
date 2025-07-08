import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchHANU {
    public static void main(String[] args) {
        String fileName = "Test.txt"; // Tên file
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" "); // Đọc từng dòng và nối vào chuỗi tổng
            }}}}