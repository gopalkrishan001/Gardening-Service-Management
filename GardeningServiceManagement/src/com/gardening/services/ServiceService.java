package com.gardening.services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.gardening.db.DBConnection;
import com.gardening.models.Service;

public class ServiceService {
    public boolean addService(Service s) {
        try {
            Connection c = DBConnection.getConnection();
            String q = "INSERT INTO Services (Service_Name, Description, Price, Duration, Availability, Seasonal_Discount) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(q);
            p.setString(1, s.serviceName);
            p.setString(2, s.description);
            p.setDouble(3, s.price);
            p.setInt(4, s.duration);
            p.setString(5, s.availability);
            p.setDouble(6, s.seasonalDiscount);
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

