package com.gardening.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.gardening.models.TaskLog;
import com.gardening.services.TaskLogService;

public class TaskForm extends JFrame {
    private JTextField appIdField, gardenerIdField, materialsField, timeField, statusField, obsField;
    private TaskLogService taskService = new TaskLogService();

    public TaskForm() {
        setTitle("Log Task Details");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 8, 8));

        gardenerIdField = new JTextField();
        appIdField = new JTextField();
        materialsField = new JTextField();
        timeField = new JTextField();
        statusField = new JTextField();
        obsField = new JTextField();

        add(new JLabel("Gardener ID:")); add(gardenerIdField);
        add(new JLabel("Appointment ID:")); add(appIdField);
        add(new JLabel("Materials Used:")); add(materialsField);
        add(new JLabel("Time Spent (hrs):")); add(timeField);
        add(new JLabel("Status:")); add(statusField);
        add(new JLabel("Observations:")); add(obsField);

        JButton saveBtn = new JButton("Save Task");
        add(new JLabel()); add(saveBtn);

        saveBtn.addActionListener(e -> {
            TaskLog t = new TaskLog();
            t.gardenerId = Integer.parseInt(gardenerIdField.getText());
            t.appointmentId = Integer.parseInt(appIdField.getText());
            t.materialsUsed = materialsField.getText();
            t.timeSpent = Double.parseDouble(timeField.getText());
            t.status = statusField.getText();
            t.observations = obsField.getText();
            boolean result = taskService.addTask(t);
            if (result) {
                JOptionPane.showMessageDialog(this, "Task saved.");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save task.");
            }
        });
    }
}
