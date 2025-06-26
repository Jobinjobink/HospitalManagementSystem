package com.hospital.HospitalManagementSystem.model;

public class Appointment {
    private String patientName;
    private String gender;
    private String doctor;
    private String date;
    private String message;

    // Getters and Setters
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDoctor() { return doctor; }
    public void setDoctor(String doctor) { this.doctor = doctor; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
