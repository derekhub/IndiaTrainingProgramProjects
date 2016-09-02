package com.training.domains;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Patient {

    private static final Logger log = Logger.getLogger("mylogger");
    private long patientId;
    private String patientName;
    private String patientType;

    public Patient() {
        super();

        log.log(Level.INFO, "Patient Initialized");
    }

    public Patient(long patientId, String patientName, String patientType) {
        super();
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientType = patientType;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

}
