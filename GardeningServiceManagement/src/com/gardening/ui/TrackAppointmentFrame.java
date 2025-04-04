package com.gardening.ui;

import javax.swing.*;
import java.awt.*;

public class TrackAppointmentFrame extends JFrame {
    public TrackAppointmentFrame() {
        setTitle("Track Appointment");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea("Feature to view appointment statuses will be displayed here.\n\n\"Track Appointment\" functionality can be enhanced with database joins and filters.");
        textArea.setEditable(false);
        add(new JScrollPane(textArea));
    }
}
