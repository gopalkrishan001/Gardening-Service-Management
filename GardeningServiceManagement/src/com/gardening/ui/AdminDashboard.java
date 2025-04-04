package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("Welcome, Admin", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 20));
        heading.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(heading, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 100, 20, 100));

        JButton usersBtn = new JButton("Manage Users");
        JButton servicesBtn = new JButton("Manage Services");
        JButton reportsBtn = new JButton("View Reports");

        usersBtn.addActionListener(e -> new UserManagementFrame().setVisible(true));
        servicesBtn.addActionListener(e -> new ServiceManagementFrame().setVisible(true));
        reportsBtn.addActionListener(e -> new ReportFrame().setVisible(true));

        panel.add(usersBtn);
        panel.add(servicesBtn);
        panel.add(reportsBtn);

        add(panel, BorderLayout.CENTER);
    }
}
