import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // Set the title of the frame
        frame.setTitle("Login form");


        // Set the size of the frame
        frame.setSize(400, 300);
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hiển thị cửa sổ (QUAN TRỌNG!)
        frame.setVisible(true);
    }
}
