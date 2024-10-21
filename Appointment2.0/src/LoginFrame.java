import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class LoginFrame extends JFrame {
    
    public LoginFrame() {
        // Set frame properties
        setTitle("Hospital Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false); // Make the frame unresizable
        
        // Create a panel for the navigation bar
        JPanel navBar = new JPanel();
        navBar.setBackground(Color.WHITE);
        navBar.setBounds(0, 11, 800, 50);
        navBar.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 15));
        getContentPane().add(navBar);
        
        // Add navigation links
        String[] navLinks = {"Home", "Appointment", "Patient", "Doctor Review", "Restaurant", "Finances", "About Us"};
        for (String link : navLinks) {
            JLabel navLabel = new JLabel(link);
            navLabel.setFont(new Font("Roboto", Font.BOLD, 18));
            navBar.add(navLabel);
        }
        
        // Create Sign In label
        JLabel lblSignIn = new JLabel("Sign In");
        lblSignIn.setFont(new Font("Arial", Font.BOLD, 36));
        lblSignIn.setBounds(300, 80, 200, 40);
        getContentPane().add(lblSignIn);
        
        // Create sub-label
        JLabel lblSub = new JLabel("Please Login To Continue");
        lblSub.setFont(new Font("Arial", Font.PLAIN, 18));
        lblSub.setBounds(300, 130, 300, 30);
        getContentPane().add(lblSub);
        
        // Create guidance text
        JLabel lblGuidance = new JLabel("Please sign in to access your account and manage your appointments.");
        lblGuidance.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGuidance.setBounds(88, 147, 400, 30);
        getContentPane().add(lblGuidance);
        
        // Create email field
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEmail.setBounds(200, 200, 100, 30);
        getContentPane().add(lblEmail);
        
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(180, 93, 400, 30);
        getContentPane().add(txtEmail);
        
        // Create password field
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblPassword.setBounds(200, 270, 100, 30);
        getContentPane().add(lblPassword);
        
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(200, 300, 400, 30);
        getContentPane().add(txtPassword);
        
        // Create confirm password field
        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        lblConfirmPassword.setBounds(200, 340, 150, 30);
        getContentPane().add(lblConfirmPassword);
        
        JPasswordField txtConfirmPassword = new JPasswordField();
        txtConfirmPassword.setBounds(200, 370, 400, 30);
        getContentPane().add(txtConfirmPassword);
        
        // Create Sign Up button
        JButton btnSignUp = new JButton("Sign Up");
        btnSignUp.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSignUp.setBounds(200, 420, 150, 40);
        getContentPane().add(btnSignUp);
        
        // Create Sign In button
        JButton btnSignIn = new JButton("Sign In");
        btnSignIn.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSignIn.setBounds(450, 420, 150, 40);
        getContentPane().add(btnSignIn);
        
        JLabel lblNewLabel = new JLabel (new ImageIcon("C:\\Users\\celeb\\eclipse-workspace\\Appointment2.0\\Logo.png"));
        lblNewLabel.addAncestorListener(new AncestorListener() {
        	public void ancestorAdded(AncestorEvent event) {
        	}
        	public void ancestorMoved(AncestorEvent event) {
        	}
        	public void ancestorRemoved(AncestorEvent event) {
        	}
        });
        lblNewLabel.setBounds(229, 72, 1268, 812);
        getContentPane().add(lblNewLabel);
        
        // Add action listeners for buttons
        btnSignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle sign-in logic here
                JOptionPane.showMessageDialog(LoginFrame.this, "Sign In button clicked");
            }
        });
        
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle sign-up logic here
                JOptionPane.showMessageDialog(LoginFrame.this, "Sign Up button clicked");
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginFrame frame = new LoginFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
