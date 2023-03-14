
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    // Declare Swing Components
    JLabel nameLabel, emailLabel, phoneLabel;
    JTextField nameTextField, emailTextField, phoneTextField;
    JButton submitBtn;

    // For actual Value
    String name, email, phone;

    // Constructor
    public StudentRegistrationForm() {
        // Set Frame Properties
        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Initialize Swing Components
        nameLabel = new JLabel("Name");
        emailLabel = new JLabel("Email");
        phoneLabel = new JLabel("Phone");

        nameTextField = new JTextField();
        emailTextField = new JTextField();
        phoneTextField = new JTextField();
        submitBtn = new JButton("Submit");

        // Add all components
        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(phoneLabel);
        add(phoneTextField);
        add(submitBtn);
        // addActionListener to submit button
        submitBtn.addActionListener(this);

        // make form visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Implementing actionListener
        if (e.getSource() == submitBtn) {
            name = nameTextField.getText();
            email = emailTextField.getText();
            phone = phoneTextField.getText();
            JOptionPane.showMessageDialog(this, "Form Submitted");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}