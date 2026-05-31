import javax.swing.*;
import java.awt.*;
public class GUIPanelExample {
    public static void main(String[] args) {
        // 1. Create the main JFrame window
        JFrame frame = new JFrame("Panel Example");
        // 2. Create a JPanel with gray background and set its bounds
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);            // Use no layout manager
        panel.setBounds(30, 30, 200, 150); // position (30,30), size 200x150
        // 3. Create Button 1 with yellow background
        JButton btn1 = new JButton("Button 1");
        btn1.setBackground(Color.YELLOW);
        btn1.setBounds(10, 10, 80, 30);   // absolute position inside panel
        // 3. Create Button 2 with green background
        JButton btn2 = new JButton("Button 2");
        btn2.setBackground(Color.GREEN);
        btn2.setBounds(100, 10, 80, 30);  // absolute position inside panel
        // Add both buttons to the panel
        panel.add(btn1);
        panel.add(btn2);
        // 4. Add the panel to the frame
        frame.setLayout(null);            // No layout on frame either
        frame.add(panel);
        // 5. Set frame size to 400x400 pixels
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make the frame visible
        frame.setVisible(true);
    }
}