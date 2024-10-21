import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientInformationFrame extends JFrame {

    public PatientInformationFrame() {
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
        JLabel lblTitle = new JLabel("Patient's information");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitle.setBounds(450, 80, 400, 40);
        mainPanel.add(lblTitle);

        // Create sub-title label
        JLabel lblSubTitle = new JLabel("Please Sign Up To Continue");
        lblSubTitle.setFont(new Font("Arial", Font.PLAIN, 18));
        lblSubTitle.setBounds(450, 130, 400, 30);
        mainPanel.add(lblSubTitle);

        // Create guidance text
        JLabel lblGuidance = new JLabel("We are excited to assist you with your needs. Please follow the simple steps below to sign up for an appointment");
        lblGuidance.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGuidance.setBounds(300, 160, 700, 30);
        mainPanel.add(lblGuidance);

        // Create first name field
        JLabel lblFirstName = new JLabel("First Name");
        lblFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
        lblFirstName.setBounds(300, 200, 100, 30);
        mainPanel.add(lblFirstName);

        JTextField txtFirstName = new JTextField();
        txtFirstName.setBounds(300, 230, 200, 30);
        mainPanel.add(txtFirstName);

        // Create last name field
        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setFont(new Font("Arial", Font.PLAIN, 14));
        lblLastName.setBounds(550, 200, 100, 30);
        mainPanel.add(lblLastName);

        JTextField txtLastName = new JTextField();
        txtLastName.setBounds(550, 230, 200, 30);
        mainPanel.add(txtLastName);

        // Create email field
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEmail.setBounds(300, 270, 100, 30);
        mainPanel.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(300, 300, 200, 30);
        mainPanel.add(txtEmail);

        // Create mobile number field
        JLabel lblMobileNumber = new JLabel("Mobile Number");
        lblMobileNumber.setFont(new Font("Arial", Font.PLAIN, 14));
        lblMobileNumber.setBounds(550, 270, 100, 30);
        mainPanel.add(lblMobileNumber);

        JTextField txtMobileNumber = new JTextField();
        txtMobileNumber.setBounds(550, 300, 200, 30);
        mainPanel.add(txtMobileNumber);

        // Create medical problem field
        JLabel lblMedicalProblem = new JLabel("Any medical problem");
        lblMedicalProblem.setFont(new Font("Arial", Font.PLAIN, 14));
        lblMedicalProblem.setBounds(300, 340, 150, 30);
        mainPanel.add(lblMedicalProblem);

        JTextField txtMedicalProblem = new JTextField();
        txtMedicalProblem.setBounds(300, 370, 200, 30);
        mainPanel.add(txtMedicalProblem);

        // Create date of birth field
        JLabel lblDateOfBirth = new JLabel("Date of Birth");
        lblDateOfBirth.setFont(new Font("Arial", Font.PLAIN, 14));
        lblDateOfBirth.setBounds(550, 340, 100, 30);
        mainPanel.add(lblDateOfBirth);

        JTextField txtDateOfBirth = new JTextField();
        txtDateOfBirth.setBounds(550, 370, 200, 30);
        mainPanel.add(txtDateOfBirth);

        // Create gender combo box
        JLabel lblGender = new JLabel("Gender");
        lblGender.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGender.setBounds(300, 410, 100, 30);
        mainPanel.add(lblGender);

        JComboBox<String> cmbGender = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        cmbGender.setBounds(300, 440, 200, 30);
        mainPanel.add(cmbGender);

        // Create password field
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblPassword.setBounds(550, 410, 100, 30);
        mainPanel.add(lblPassword);

        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(550, 440, 200, 30);
        mainPanel.add(txtPassword);

        // Create confirm password field
        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblConfirmPassword.setBounds(800, 410, 150, 30);
        mainPanel.add(lblConfirmPassword);

        JPasswordField txtConfirmPassword = new JPasswordField();
        txtConfirmPassword.setBounds(800, 440, 200, 30);
        mainPanel.add(txtConfirmPassword);

        // Create Next button
        JButton btnNext = new JButton("Next");
        btnNext.setFont(new Font("Arial", Font.PLAIN, 14));
        btnNext.setBounds(550, 500, 150, 40);
        mainPanel.add(btnNext);

        // Add action listeners for buttons
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle next button logic here
                JOptionPane.showMessageDialog(PatientInformationFrame.this, "Next button clicked");
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PatientInformationFrame frame = new PatientInformationFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
