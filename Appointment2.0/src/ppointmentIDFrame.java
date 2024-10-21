import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class AppointmentIDFrame extends JFrame {

    public AppointmentIDFrame() {
        // Set frame properties
        setTitle("Hospital Management System");
        setSize(1280, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Create logo
        URL logoUrl = getClass().getClassLoader().getResource("logo-1@2x.png");
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

        // Create "Make a second Appointment" button
        URL iconUrl = getClass().getClassLoader().getResource("appointment_icon.png");
        if (iconUrl != null) {
            JButton secondAppointmentButton = new JButton("Make a second Appointment");
            secondAppointmentButton.setFont(new Font("Arial", Font.PLAIN, 24));
            secondAppointmentButton.setBackground(Color.ORANGE);
            secondAppointmentButton.setBounds(390, 100, 500, 60);
            secondAppointmentButton.setHorizontalAlignment(SwingConstants.LEFT);
            secondAppointmentButton.setIcon(new ImageIcon(iconUrl));
            getContentPane().add(secondAppointmentButton);

            // Add action listener for the button
            secondAppointmentButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(AppointmentIDFrame.this, "Make a second Appointment button clicked");
                }
            });
        } else {
            System.err.println("Appointment icon image not found.");
        }

        // Create title label
        JLabel lblTitle = new JLabel("Enter your Appointment ID");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitle.setBounds(390, 200, 600, 40);
        getContentPane().add(lblTitle);

        // Create sub-title label
        JLabel lblSubTitle = new JLabel("<html>Please note that you can schedule a second appointment<br>only after a period of one month has passed since your first appointment.</html>");
        lblSubTitle.setFont(new Font("Arial", Font.PLAIN, 18));
        lblSubTitle.setBounds(390, 250, 600, 60);
        getContentPane().add(lblSubTitle);

        // Create appointment ID field
        JLabel lblAppointmentID = new JLabel("Appointment ID");
        lblAppointmentID.setFont(new Font("Arial", Font.PLAIN, 14));
        lblAppointmentID.setBounds(390, 330, 200, 30);
        getContentPane().add(lblAppointmentID);

        JTextField txtAppointmentID = new JTextField();
        txtAppointmentID.setBounds(390, 360, 500, 30);
        getContentPane().add(txtAppointmentID);

        // Create reason field
        JLabel lblReason = new JLabel("Reason behind the second Appointment?");
        lblReason.setFont(new Font("Arial", Font.PLAIN, 14));
        lblReason.setBounds(390, 400, 300, 30);
        getContentPane().add(lblReason);

        JTextField txtReason = new JTextField();
        txtReason.setBounds(390, 430, 500, 30);
        getContentPane().add(txtReason);

        // Create confirm button
        JButton btnConfirm = new JButton("Confirm");
        btnConfirm.setFont(new Font("Arial", Font.PLAIN, 14));
        btnConfirm.setBounds(540, 490, 150, 40);
        getContentPane().add(btnConfirm);

        // Add action listener for the confirm button
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AppointmentIDFrame.this, "Confirm button clicked");
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppointmentIDFrame frame = new AppointmentIDFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
