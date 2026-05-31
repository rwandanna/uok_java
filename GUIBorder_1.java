import javax.swing.*;
import java.awt.*;
public class GUIBorder_1 {
    // 2. Constructor — creates and displays the JFrame
    Border_1() {
        JFrame frame = new JFrame("BorderLayout Demo");
        // 3. Add five JButton components at the five BorderLayout positions
        frame.add(new JButton("NORTH"),   BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"),   BorderLayout.SOUTH);
        frame.add(new JButton("EAST"),    BorderLayout.EAST);
        frame.add(new JButton("WEST"),    BorderLayout.WEST);
        frame.add(new JButton("CENTER"),  BorderLayout.CENTER);
        // 4. Set frame size to 300x300 pixels
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 5. Make the frame visible
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Border_1();   // Instantiate — triggers the constructor
    }
}