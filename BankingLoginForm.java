import javax.swing.*;
import java.awt.*;
public class BankingLoginForm {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Banking System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // 
 Centre panel using GridBagLayout for neat alignment 
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(70, 100, 140));  // Dark blue background
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);           // Padding around each cell
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // Title label: "Bank of Kigali (BK)"
        JLabel titleLabel = new JLabel("Bank of Kigali (BK)", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        titleLabel.setForeground(Color.WHITE);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);
        // 1. JLabel "Username:"
        gbc.gridwidth = 1;
        gbc.gridx = 0; gbc.gridy = 1;
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE);
        panel.add(userLabel, gbc);
        // 2. JTextField for username input
        gbc.gridx = 1; gbc.gridy = 1;
        JTextField usernameField = new JTextField(15);
        panel.add(usernameField, gbc);
        // 3. JLabel "Password:"
        gbc.gridx = 0; gbc.gridy = 2;
        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(Color.WHITE);
        panel.add(passLabel, gbc);
        // 4. JPasswordField — masked input (shows dots instead of characters)
        gbc.gridx = 1; gbc.gridy = 2;
        JPasswordField passwordField = new JPasswordField(15);
        panel.add(passwordField, gbc);
        // 5. JButton "Login"
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        JButton loginBtn = new JButton("Login");
        panel.add(loginBtn, gbc);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}