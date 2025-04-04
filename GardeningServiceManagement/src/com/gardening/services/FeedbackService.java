package com.gardening.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gardening.db.DBConnection;
import com.gardening.models.Feedback;

public class FeedbackService {
    public boolean addFeedback(Feedback f) {
        try {
            Connection c = DBConnection.getConnection();
            String q = "INSERT INTO Feedback (Appointment_ID, Rating, Comments, Response, Sentiment_Score) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(q);
            p.setInt(1, f.appointmentId);
            p.setInt(2, f.rating);
            p.setString(3, f.comments);
            p.setString(4, f.response);
            p.setDouble(5, f.sentimentScore);
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
