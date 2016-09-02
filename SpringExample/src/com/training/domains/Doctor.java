package com.training.domains;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Doctor {

    private static final Logger log = Logger.getLogger("doctor");
    private int doctorCode;
    private String doctorName;
    private String specialization;

    private Patient patient;

    private List<Patient> patientList;

    private HashMap<String, String> supportStaff;

    public Doctor() {
        super();

        log.info("Doctor initialized");
    }

    public Doctor(int doctorCode, String doctorName, String specialization, Patient patient) {
        super();
        this.doctorCode = doctorCode;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(int doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public HashMap<String, String> getSupportStaff() {
        return supportStaff;
    }

    public void setSupportStaff(HashMap<String, String> supportStaff) {
        this.supportStaff = supportStaff;
    }

    @Override
    public String toString() {
        return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", specialization=" + specialization
                + "]";
    }

}
