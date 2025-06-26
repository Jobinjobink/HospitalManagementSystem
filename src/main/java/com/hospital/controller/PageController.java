package com.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";  // Loads index.html from templates
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // Loads login.html
    }

    @GetMapping("/register")
    public String register() {
        return "register";  // Loads register.html
    }

    @GetMapping("/doctor-list")
    public String doctorList() {
        return "doctor-list";  // Loads doctor-list.html
    }

    @GetMapping("/appointment")
    public String appointment() {
        return "appointment";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

}


