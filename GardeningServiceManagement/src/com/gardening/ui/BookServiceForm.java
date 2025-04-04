package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.gardening.models.Appointment;
import com.gardening.services.AppointmentService;

public class BookServiceForm extends JFrame {
    private JTextField customerIdField, serviceIdField, dateField, gardenerIdField;
    private AppointmentService service = new AppointmentService();

    public BookServiceForm() {
        setTitle("Book Gardening Service");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        customerIdField = new JTextField();
        serviceIdField = new JTextField();
        dateField = new JTextField();
        gardenerIdField = new JTextField();

        add(new JLabel("Customer ID:")); add(customerIdField);
        add(new JLabel("Service ID:")); add(serviceIdField);
        add(new JLabel("Preferred Date (YYYY-MM-DD):")); add(dateField);
        add(new JLabel("Gardener ID:")); add(gardenerIdField);

        JButton bookBtn = new JButton("Book Service");
        add(new JLabel()); add(bookBtn);

        bookBtn.addActionListener(e -> {
            Appointment a = new Appointment();
            a.customerId = Integer.parseInt(customerIdField.getText());
            a.serviceId = Integer.parseInt(serviceIdField.getText());
            a.date = dateField.getText();
            a.status = "Pending";
            a.assignedGardener = Integer.parseInt(gardenerIdField.getText());
            a.notificationStatus = "Sent";

            boolean result = service.addAppointment(a);
            if (result) {
                JOptionPane.showMessageDialog(this, "Appointment booked.");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Booking failed.");
            }
        });
    }
}

