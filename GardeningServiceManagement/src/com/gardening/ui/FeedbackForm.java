package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.gardening.models.Feedback;
import com.gardening.services.FeedbackService;

public class FeedbackForm extends JFrame {
    private JTextField appointmentIdField, ratingField, commentsField;
    private FeedbackService feedbackService = new FeedbackService();

    public FeedbackForm() {
        setTitle("Send Feedback");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setResizable(false);

        appointmentIdField = new JTextField();
        ratingField = new JTextField();
        commentsField = new JTextField();

        add(new JLabel("Appointment ID:")); add(appointmentIdField);
        add(new JLabel("Rating (1-5):")); add(ratingField);
        add(new JLabel("Comments:")); add(commentsField);
        add(new JLabel());

        JButton submitBtn = new JButton("Submit");
        add(new JLabel());
        add(submitBtn);

        submitBtn.addActionListener(e -> {
            Feedback f = new Feedback();
            f.appointmentId = Integer.parseInt(appointmentIdField.getText());
            f.rating = Integer.parseInt(ratingField.getText());
            f.comments = commentsField.getText();
            f.response = "";
            f.sentimentScore = 0;
            boolean result = feedbackService.addFeedback(f);
            if (result) {
                JOptionPane.showMessageDialog(this, "Feedback submitted successfully.");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to submit feedback.");
            }
        });
    }
}
