package com.gardening.controller;

import com.gardening.services.*;
import com.gardening.models.*;
import javax.swing.*;

public class LoginController {
    public void login(String email, String password) {
        if (email.equals("admin@garden.com") && password.equals("admin")) {
            new com.gardening.ui.AdminDashboard().setVisible(true);
        } else if (email.equals("customer@garden.com") && password.equals("customer")) {
            new com.gardening.ui.CustomerDashboard().setVisible(true);
        } else if (email.equals("gardener@garden.com") && password.equals("gardener")) {
            new com.gardening.ui.GardenerDashboard().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login fail");
        }
    }
}
