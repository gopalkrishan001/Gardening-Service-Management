package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.gardening.models.TaskLog;
import com.gardening.services.TaskLogService;

public class GardenerDashboard extends JFrame {
    public GardenerDashboard() {
        setTitle("Gardener Dashboard");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("Welcome, Gardener", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 20));
        heading.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(heading, BorderLayout.NORTH);

        JButton logBtn = new JButton("Log Task Info");
        logBtn.addActionListener(e -> new TaskForm().setVisible(true));

        JPanel panel = new JPanel(new GridLayout(1, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));
        panel.add(logBtn);

        add(panel, BorderLayout.CENTER);
    }
}
