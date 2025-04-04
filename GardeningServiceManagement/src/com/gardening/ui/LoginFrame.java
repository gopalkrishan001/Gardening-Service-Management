package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import com.gardening.controller.LoginController;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Gardening Service Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Login to Gardening System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel emailLbl = new JLabel("Email:");
        JTextField emailTxt = new JTextField();
        JLabel passLbl = new JLabel("Password:");
        JPasswordField passTxt = new JPasswordField();

        formPanel.add(emailLbl); formPanel.add(emailTxt);
        formPanel.add(passLbl); formPanel.add(passTxt);

        JButton loginBtn = new JButton("Login");
        JPanel btnPanel = new JPanel();
        btnPanel.add(loginBtn);

        add(formPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        loginBtn.addActionListener(e -> {
            new LoginController().login(emailTxt.getText(), new String(passTxt.getPassword()));
        });
    }
}
