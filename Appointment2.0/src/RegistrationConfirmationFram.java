import javax.swing.*;
import java.awt.*;

public class RegistrationConfirmationFrame extends JFrame {

    public RegistrationConfirmationFrame() {
        // Set frame properties
        setTitle("Hospital Management System");
        setSize(1280, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create logo
        JLabel logoLabel = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("logo-1@2x.png")));
        logoLabel.setBounds(10, 10, 100, 50);
        getContentPane().add(logoLabel);

        // Create navigation bar
        JPanel navBar = new JPanel();
        navBar.setBackground(Color.WHITE);
        navBar.setBounds(0, 0, 1280, 50);
        navBar.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        getContentPane().add(navBar);

        // Add navigation links
        String[] navLinks = {"Home", "Appointment", "Patient", "Doctor Review", "Restaurant", "Finances", "About Us"};
        for (String link : navLinks) {
            JLabel navLabel = new JLabel(link);
            navLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            navLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            navBar.add(navLabel);
        }

        // Create title label
        JLabel lblTitle = new JLabel("Registration Confirmation");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitle.setBounds(450, 80, 400, 40);
        getContentPane().add(lblTitle);

        // Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.ORANGE);
        mainPanel.setBounds(200, 150, 880, 500);
        mainPanel.setLayout(null);
        getContentPane().add(mainPanel);

        // Create confirmation message labels
        JLabel lblMessage1 = new JLabel("You have been officially registered");
        lblMessage1.setFont(new Font("Arial", Font.PLAIN, 24));
        lblMessage1.setHorizontalAlignment(SwingConstants.CENTER);
        lblMessage1.setBounds(140, 50, 600, 30);
        mainPanel.add(lblMessage1);

        JLabel lblCheckmark = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("checkmark.png")));
        lblCheckmark.setBounds(390, 100, 100, 100);
        mainPanel.add(lblCheckmark);

        JLabel lblMessage2 = new JLabel("Now you can login with your username and password");
        lblMessage2.setFont(new Font("Arial", Font.PLAIN, 24));
        lblMessage2.setHorizontalAlignment(SwingConstants.CENTER);
        lblMessage2.setBounds(140, 220, 600, 30);
        mainPanel.add(lblMessage2);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegistrationConfirmationFrame frame = new RegistrationConfirmationFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
