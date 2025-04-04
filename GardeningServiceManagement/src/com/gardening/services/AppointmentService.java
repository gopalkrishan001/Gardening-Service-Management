package com.gardening.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gardening.db.DBConnection;
import com.gardening.models.Appointment;

public class AppointmentService {
    public boolean addAppointment(Appointment a) {
        try {
            Connection c = DBConnection.getConnection();
            String q = "INSERT INTO Appointments (Customer_ID, Service_ID, Date, Status, Assigned_Gardener, Notification_Status) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(q);
            p.setInt(1, a.customerId);
            p.setInt(2, a.serviceId);
            p.setString(3, a.date);
            p.setString(4, a.status);
            p.setInt(5, a.assignedGardener);
            p.setString(6, a.notificationStatus);
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

