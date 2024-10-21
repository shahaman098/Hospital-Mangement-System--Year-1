import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KinInformationFrame extends JFrame {

    public KinInformationFrame() {
        // Set frame properties
        setTitle("Hospital Management System");
        setSize(1280, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create logo
        JLabel logoLabel = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("logo.png")));
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

        // Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 60, 1280, 700);
        mainPanel.setLayout(null);
        getContentPane().add(mainPanel);

        // Create title label
        JLabel lblTitle = new JLabel("Kin's information");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitle.setBounds(450, 80, 400, 40);
        mainPanel.add(lblTitle);

        // Create sub-title label
        JLabel lblSubTitle = new JLabel("Please Sign Up To Continue");
        lblSubTitle.setFont(new Font("Arial", Font.PLAIN, 18));
        lblSubTitle.setBounds(450, 130, 400, 30);
        mainPanel.add(lblSubTitle);

        // Create guidance text
        JLabel lblGuidance = new JLabel("<html>Lorem Ipsum is simply dummy text of the printing and typesetting industry.<br>Lorem Ipsum has been the industry's standard dummy text ever since.</html>");
        lblGuidance.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGuidance.setBounds(300, 160, 700, 30);
        mainPanel.add(lblGuidance);

        // Create first name field
        JLabel lblFirstName = new JLabel("Kin's First Name");
        lblFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
        lblFirstName.setBounds(300, 200, 150, 30);
        mainPanel.add(lblFirstName);

        JTextField txtFirstName = new JTextField();
        txtFirstName.setBounds(300, 230, 200, 30);
        mainPanel.add(txtFirstName);

        // Create last name field
        JLabel lblLastName = new JLabel("Kin's Last Name");
        lblLastName.setFont(new Font("Arial", Font.PLAIN, 14));
        lblLastName.setBounds(550, 200, 150, 30);
        mainPanel.add(lblLastName);

        JTextField txtLastName = new JTextField();
        txtLastName.setBounds(550, 230, 200, 30);
        mainPanel.add(txtLastName);

        // Create email field
        JLabel lblEmail = new JLabel("Kin's Email");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEmail.setBounds(300, 270, 150, 30);
        mainPanel.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(300, 300, 200, 30);
        mainPanel.add(txtEmail);

        // Create mobile number field
        JLabel lblMobileNumber = new JLabel("Kin's Mobile Number");
        lblMobileNumber.setFont(new Font("Arial", Font.PLAIN, 14));
        lblMobileNumber.setBounds(550, 270, 150, 30);
        mainPanel.add(lblMobileNumber);

        JTextField txtMobileNumber = new JTextField();
        txtMobileNumber.setBounds(550, 300, 200, 30);
        mainPanel.add(txtMobileNumber);

        // Create date of birth field
        JLabel lblDateOfBirth = new JLabel("Date of Birth");
        lblDateOfBirth.setFont(new Font("Arial", Font.PLAIN, 14));
        lblDateOfBirth.setBounds(300, 340, 150, 30);
        mainPanel.add(lblDateOfBirth);

        JTextField txtDateOfBirth = new JTextField();
        txtDateOfBirth.setBounds(300, 370, 450, 30);
        mainPanel.add(txtDateOfBirth);

        // Create Register/Sign Up button
        JButton btnRegister = new JButton("Register/Sign UP");
        btnRegister.setFont(new Font("Arial", Font.PLAIN, 14));
        btnRegister.setBounds(540, 430, 200, 40);
        mainPanel.add(btnRegister);

        // Add action listeners for buttons
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle register/sign up button logic here
                JOptionPane.showMessageDialog(KinInformationFrame.this, "Register/Sign UP button clicked");
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    KinInformationFrame frame = new KinInformationFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
