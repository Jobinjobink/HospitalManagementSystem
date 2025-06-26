package com.hospital.HospitalManagementSystem.controller;

import com.hospital.HospitalManagementSystem.model.Appointment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppointmentController {

    @PostMapping("/submit-appointment")
    public String submitAppointment(@ModelAttribute Appointment appointment, Model model) {
        // In a real app, you'd save to DB here
        model.addAttribute("appointment", appointment);
        return "appointment-success";
    }
}
