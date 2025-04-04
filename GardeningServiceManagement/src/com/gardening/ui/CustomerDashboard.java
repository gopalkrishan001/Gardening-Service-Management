package com.gardening.ui;

import javax.swing.*;
import java.awt.*;

public class CustomerDashboard extends JFrame {
    public CustomerDashboard() {
        setTitle("Customer Dashboard");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("Welcome, Customer", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 20));
        heading.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(heading, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        JButton bookBtn = new JButton("Book Service");
        JButton trackBtn = new JButton("Track Appointment");
        JButton feedbackBtn = new JButton("Send Feedback");
        JButton viewFeedbackBtn = new JButton("View Feedback");

        bookBtn.addActionListener(e -> new BookServiceForm().setVisible(true));
        trackBtn.addActionListener(e -> new TrackAppointmentFrame().setVisible(true));
        feedbackBtn.addActionListener(e -> new FeedbackForm().setVisible(true));
        viewFeedbackBtn.addActionListener(e -> new ViewFeedbackFrame().setVisible(true));

        panel.add(bookBtn);
        panel.add(trackBtn);
        panel.add(feedbackBtn);
        panel.add(viewFeedbackBtn);

        add(panel, BorderLayout.CENTER);
    }
}
