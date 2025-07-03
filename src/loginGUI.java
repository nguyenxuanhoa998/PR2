import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class loginGUI implements ActionListener {
    private static JLabel titleLabel;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel success;
    private static List<String[]> accountList = new ArrayList<>(); // Lưu danh sách tài khoản

    public static void main(String[] args) {
        // Đọc dữ liệu từ file
        loadAccountsFromFile("data.txt");

        // Tạo frame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo panel
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        // Tiêu đề
        titleLabel = new JLabel("Simple Login Form");
        titleLabel.setBounds(10, 10, 320, 35);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);

        // Label Username
        userLabel = new JLabel("User:");
        userLabel.setBounds(10, 60, 80, 25);
        panel.add(userLabel);

        // Text nhập username
        userText = new JTextField();
        userText.setBounds(100, 60, 165, 25);
        panel.add(userText);

        // Label Password
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 90, 80, 25);
        panel.add(passLabel);

        // Text nhập password
        passText = new JPasswordField();
        passText.setBounds(100, 90, 165, 25);
        panel.add(passText);

        // Nút Login
        button = new JButton("Login");
        button.setBounds(10, 120, 80, 25);
        button.addActionListener(new loginGUI()); // Gắn sự kiện
        panel.add(button);

        // Label kết quả
        success = new JLabel("");
        success.setBounds(100, 120, 250, 25);
        panel.add(success);

        // Hiển thị form
        frame.setVisible(true);
    }

    public static void loadAccountsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String user;
            while ((user = reader.readLine()) != null) {
                String pass = reader.readLine();
                if (pass != null) {
                    accountList.add(new String[]{user.trim(), pass.trim()});
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputUser = userText.getText().trim();
        String inputPass = new String(passText.getPassword()).trim();

        boolean found = false;

        for (int i = 0; i < accountList.size(); i++) {
            String[] acc = accountList.get(i);
            String user = acc[0];
            String pass = acc[1];

            if (user.equals(inputUser) && pass.equals(inputPass)) {
                found = true;
                if (i == 0) {
                    // Admin đăng nhập -> mở bảng
                    showAdminTable();
                } else {
                    success.setText("Đăng nhập thành công!");
                }
                break;
            }
        }

        if (!found) {
            success.setText("Sai tài khoản hoặc mật khẩu.");
        }
    }

    // Tạo window mới cho admin để hiển thị danh sách user/pass
    private void showAdminTable() {
        JFrame tableFrame = new JFrame("Danh sách tài khoản");
        tableFrame.setSize(400, 300);

        String[] columnNames = {"Username", "Password"};
        String[][] data = new String[accountList.size()][2];

        for (int i = 0; i < accountList.size(); i++) {
            data[i][0] = accountList.get(i)[0];
            data[i][1] = accountList.get(i)[1];
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        tableFrame.add(scrollPane);

        tableFrame.setVisible(true);
    }
}
