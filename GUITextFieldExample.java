import javax.swing.*;
public class GUITextFieldExample {
    public static void main(String[] args) {
        // 1. Create JFrame titled "TextField Example"
        JFrame frame = new JFrame("TextField Example");
        frame.setLayout(null);                // No layout manager
        // 2a. First JTextField — "Welcome to Javatpoint."
        JTextField tf1 = new JTextField("Welcome to Javatpoint.");
        tf1.setBounds(50, 100, 200, 30);      // position (50,100), size 200x30
        // 2b. Second JTextField — "AWT Tutorial"
        JTextField tf2 = new JTextField("AWT Tutorial");
        tf2.setBounds(50, 150, 200, 30);      // position (50,150), size 200x30
        // Add text fields to the frame
        frame.add(tf1);
        frame.add(tf2);
        // 3. Set frame size to 400x400
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 4. Make frame visible
        frame.setVisible(true);
    }
}