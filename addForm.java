import java.awt.*;
import javax.swing.*;

public class addForm {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Address Book");
        JLabel lblName = new JLabel("Name :");
        JLabel lblCity = new JLabel("City :");
        JLabel lblState = new JLabel("State :");
        JLabel lblMail = new JLabel("E-Mail :");

        JTextField txtName = new JTextField(40);
        JTextField txtCity = new JTextField(40);
        JTextField txtState = new JTextField(40);
        JTextField txtMail = new JTextField(40);

        JButton btnClose = new JButton("Close");
        JButton btnSave = new JButton("Save");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        JButton btnView = new JButton("View");
        JButton btnClear = new JButton("Clear");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        GridLayout gl42 = new GridLayout(4, 2);
        GridLayout gl21 = new GridLayout(2, 1);

        FlowLayout fl = new FlowLayout();
        p1.setLayout(gl42);
        p1.add(lblName);
        p1.add(txtName);
        p1.add(lblCity);
        p1.add(txtCity);
        p1.add(lblState);
        p1.add(txtState);
        p1.add(lblMail);
        p1.add(txtMail);
        p2.setLayout(fl);
        p2.add(btnClear);
        p2.add(btnSave);
        p2.add(btnUpdate);
        p2.add(btnDelete);
        p2.add(btnView);
        p2.add(btnClose);
        f1.setLayout(gl21);
        f1.add(p1);
        f1.add(p2);
        f1.setSize(400, 200);
        f1.setVisible(true);

    }
}
