import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppointmentsFrame extends JFrame {

    public AppointmentsFrame() {
        // Set frame properties
        setTitle("Hospital Management System");
        setSize(1280, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create logo
        URL logoUrl = getClass().getClassLoader().getResource("Logo.png");
        if (logoUrl != null) {
            JLabel logoLabel = new JLabel(new ImageIcon(logoUrl));
            logoLabel.setBounds(10, 10, 100, 50);
            getContentPane().add(logoLabel);
        } else {
            System.err.println("Logo image not found.");
        }

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
        JLabel lblTitle = new JLabel("Appointments");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitle.setBounds(450, 80, 400, 40);
        getContentPane().add(lblTitle);

        // Create main panel for buttons
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(250, 150, 800, 500);
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));
        getContentPane().add(mainPanel);

        // Add buttons
        String[] buttonTexts = {
                "Schedule an Appointment",
                "Update an Appointment",
                "Cancel an Appointment"
        };

        URL iconUrl = getClass().getClassLoader().getResource("Logo.png");
        if (iconUrl != null) {
            for (String text : buttonTexts) {
                JButton button = new JButton(text);
                button.setFont(new Font("Arial", Font.PLAIN, 24));
                button.setBackground(Color.ORANGE);
                button.setHorizontalAlignment(SwingConstants.LEFT);
                button.setIcon(new ImageIcon(iconUrl));
                mainPanel.add(button);

                // Add action listener for each button
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(AppointmentsFrame.this, text + " button clicked");
                    }
                });
            }
        } else {
            System.err.println("Appointment icon image not found.");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppointmentsFrame frame = new AppointmentsFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
