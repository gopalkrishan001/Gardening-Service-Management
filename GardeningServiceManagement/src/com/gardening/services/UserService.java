package com.gardening.services;

import com.gardening.models.User;
import com.gardening.db.DBConnection;
import java.sql.*;

public class UserService {
    public boolean addUser(User u) {
        try {
            Connection c = DBConnection.getConnection();
            String q = "INSERT INTO Users (First_Name, Last_Name, Email, Password, Role) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(q);
            p.setString(1, u.getFirstName());
            p.setString(2, u.getLastName());
            p.setString(3, u.getEmail());
            p.setString(4, u.getPassword());
            p.setString(5, u.getRole());
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}