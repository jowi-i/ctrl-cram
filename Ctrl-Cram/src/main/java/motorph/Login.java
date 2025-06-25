/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;

/**
 *
 * @author miiny
 * @author joey
 */
import GUI.Admin.EmployeePanel;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.User;
import model.UserManager;

public class Login extends JFrame {

    private JPasswordField passwordField;
    private boolean isPasswordVisible = false;
    private UserManager userManager;

    public Login () {
        userManager = new UserManager();
        userManager.loadUsersFromCSV("CSV/users.csv");
        
        setTitle("MotorPH Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JPanel mainPanel = new JPanel(new BorderLayout());

  
        JPanel leftPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, new Color(255, 105, 105, 135),
                        getWidth(), getHeight(), new Color(4, 118, 191, 135));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        leftPanel.setPreferredSize(new Dimension(450, 500));
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JLabel logoLabel = new JLabel();

        
        ImageIcon icon = null;
        try {
          icon = new ImageIcon("Images/motorph_logo.png");
        } catch (Exception e) {
            System.err.println("Logo image not found.");
        }

        if (icon != null) {
            Image scaledImage = icon.getImage().getScaledInstance(350, 234, Image.SCALE_SMOOTH);
            logoLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            logoLabel.setText("LOGO");
            logoLabel.setForeground(Color.WHITE);
            logoLabel.setFont(new Font("Arial", Font.BOLD, 48));
        }
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        leftPanel.add(Box.createVerticalGlue());
        leftPanel.add(logoLabel);
        leftPanel.add(Box.createVerticalGlue());

        
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBorder(new EmptyBorder(40, 60, 40, 60));

        JLabel welcomeLabel = new JLabel("Welcome!");
        welcomeLabel.setFont(new Font("Mustica Pro SemBd", Font.BOLD, 58));
        welcomeLabel.setForeground(new Color(0, 51, 102));
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel userLabel = new JLabel(" Username or ID:");
        userLabel.setForeground(Color.BLACK);
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField userField = new JTextField();
        userField.setMaximumSize(new Dimension(300, 35));
        userField.setAlignmentX(Component.CENTER_ALIGNMENT);
        userField.setBackground(Color.WHITE);
        userField.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
        userField.setBorder(new RoundedBorder(15));

        JLabel passLabel = new JLabel(" Password:");
        passLabel.setForeground(Color.BLACK);
        passLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(300, 35));
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordField.setBackground(Color.WHITE);
        passwordField.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
        passwordField.setBorder(new RoundedBorder(15));
        passwordField.setEchoChar('•');

        JButton togglePassword = new JButton("Show");
        togglePassword.setMaximumSize(new Dimension(80, 25));
        togglePassword.setAlignmentX(Component.CENTER_ALIGNMENT);
        togglePassword.addActionListener((ActionEvent e) -> {
            if (isPasswordVisible) {
                passwordField.setEchoChar('•');
                togglePassword.setText("Show");
            } else {
                passwordField.setEchoChar((char) 0);
                togglePassword.setText("Hide");
            }
            isPasswordVisible = !isPasswordVisible;
        });

        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(100, 45));
        loginButton.setMaximumSize(new Dimension(100, 45));
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setBackground(new Color(0, 51, 102));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
// LOGIN BUTTON CODE 
//Only Admin 10001 can enter 
         loginButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
             String empId = userField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (!userManager.containsUser(empId)) {
            JOptionPane.showMessageDialog(Login.this, "Employee ID not found.");
            return;
        }

        User user = userManager.getUserById(empId);

        if (!user.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(Login.this, "Incorrect password.");
            return;
        }

        JOptionPane.showMessageDialog(Login.this, "Logged in as " + user.getPosition());
        
        if (user.getPosition().equalsIgnoreCase("Admin")) {
            
            new EmployeePanel().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(Login.this, "Access Denied: You are not an admin.");
            return;
        }

        dispose();
    }
});

        rightPanel.add(Box.createVerticalGlue());
        rightPanel.add(welcomeLabel);
        rightPanel.add(Box.createVerticalStrut(30));
        rightPanel.add(userLabel);
        rightPanel.add(userField);
        rightPanel.add(Box.createVerticalStrut(20));
        rightPanel.add(passLabel);
        rightPanel.add(passwordField);
        rightPanel.add(Box.createVerticalStrut(5));
        rightPanel.add(togglePassword);
        rightPanel.add(Box.createVerticalStrut(30));
        rightPanel.add(loginButton);
        rightPanel.add(Box.createVerticalGlue());

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    
    static class RoundedBorder extends AbstractBorder {
        private final int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius + 1, radius + 1, radius + 1, radius + 1);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.set(radius + 1, radius + 1, radius + 1, radius + 1);
            return insets;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}

