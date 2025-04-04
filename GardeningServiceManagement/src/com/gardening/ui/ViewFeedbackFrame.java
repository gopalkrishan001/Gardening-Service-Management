package com.gardening.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import com.gardening.db.DBConnection;

public class ViewFeedbackFrame extends JFrame {
    public ViewFeedbackFrame() {
        setTitle("View Feedback");
        setSize(700, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = { "ID", "Appointment", "Rating", "Comments", "Response", "Score" };
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        try (Connection c = DBConnection.getConnection();
             Statement s = c.createStatement();
             ResultSet rs = s.executeQuery("SELECT * FROM Feedback")) {

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("Feedback_ID"),
                    rs.getInt("Appointment_ID"),
                    rs.getInt("Rating"),
                    rs.getString("Comments"),
                    rs.getString("Response"),
                    rs.getDouble("Sentiment_Score")
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to load feedback: " + e.getMessage());
        }

        add(new JScrollPane(table));
    }
}

