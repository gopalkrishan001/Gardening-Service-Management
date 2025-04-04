package com.gardening.ui;

import javax.swing.*;
import java.awt.*;

public class ReportFrame extends JFrame {
    public ReportFrame() {
        setTitle("Reports");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());
        add(new JLabel("Reports and analytics go here.", SwingConstants.CENTER), BorderLayout.CENTER);
    }
}