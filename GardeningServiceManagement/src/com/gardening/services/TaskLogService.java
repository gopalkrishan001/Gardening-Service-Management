package com.gardening.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gardening.db.DBConnection;
import com.gardening.models.TaskLog;

public class TaskLogService {
    public boolean addTask(TaskLog t) {
        try {
            Connection c = DBConnection.getConnection();
            String q = "INSERT INTO Task_Logs (Gardener_ID, Appointment_ID, Materials_Used, Time_Spent, Status, Observations) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(q);
            p.setInt(1, t.gardenerId);
            p.setInt(2, t.appointmentId);
            p.setString(3, t.materialsUsed);
            p.setDouble(4, t.timeSpent);
            p.setString(5, t.status);
            p.setString(6, t.observations);
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

