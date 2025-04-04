package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.gardening.models.User;
import com.gardening.services.UserService;

public class UserManagementFrame extends JFrame {
    private JTextField fnameField, lnameField, emailField, passField, roleField;
    private JTextArea displayArea;
    private UserService userService = new UserService();

    public UserManagementFrame() {
        setTitle("User Management");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(6, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        fnameField = new JTextField();
        lnameField = new JTextField();
        emailField = new JTextField();
        passField = new JTextField();
        roleField = new JTextField();

        form.add(new JLabel("First Name:")); form.add(fnameField);
        form.add(new JLabel("Last Name:")); form.add(lnameField);
        form.add(new JLabel("Email:")); form.add(emailField);
        form.add(new JLabel("Password:")); form.add(passField);
        form.add(new JLabel("Role:")); form.add(roleField);

        JButton addBtn = new JButton("Add User");
        JButton clearBtn = new JButton("Clear");
        form.add(addBtn); form.add(clearBtn);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(displayArea);

        add(form, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        addBtn.addActionListener(e -> addUser());
        clearBtn.addActionListener(e -> clearFields());
    }

    private void addUser() {
        User u = new User();
        u.setFirstName(fnameField.getText());
        u.setLastName(lnameField.getText());
        u.setEmail(emailField.getText());
        u.setPassword(passField.getText());
        u.setRole(roleField.getText());
        boolean result = userService.addUser(u);
        if (result) {
            displayArea.append("User added: " + u.getFirstName() + " " + u.getLastName() + "\n");
            clearFields();
        } else {
            displayArea.append("Failed to add user\n");
        }
    }

    private void clearFields() {
        fnameField.setText("");
        lnameField.setText("");
        emailField.setText("");
        passField.setText("");
        roleField.setText("");
    }
}
