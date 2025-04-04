package com.gardening.ui;

import javax.swing.*;
import java.awt.*;

public class ServiceManagementFrame extends JFrame {
    public ServiceManagementFrame() {
        setTitle("Service Management");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());
        add(new JLabel("Service management functionality goes here.", SwingConstants.CENTER), BorderLayout.CENTER);
    }
}
