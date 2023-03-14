
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

        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(phoneLabel);
        add(phoneTextField);

        add(submitBtn);

        submitBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String phone = phoneTextField.getText();
            JOptionPane.showMessageDialog(this, "Form Sublitted");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}