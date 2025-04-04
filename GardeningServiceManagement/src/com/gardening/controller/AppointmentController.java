package com.gardening.controller;

import com.gardening.models.Appointment;
import com.gardening.services.AppointmentService;

public class AppointmentController {
    public boolean book(Appointment a) {
        return new AppointmentService().addAppointment(a);
    }
}
