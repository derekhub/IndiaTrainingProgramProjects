package com.training.domains;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties
public class TestReport {

    @JsonIgnore
    private long reportId;
    private String patientName;
    private String reportType;
    private String result;

    public TestReport() {
        super();
    }

    public TestReport(long reportId, String patientName, String reportType, String result) {
        super();
        this.reportId = reportId;
        this.patientName = patientName;
        this.reportType = reportType;
        this.result = result;
    }

    public long getReportId() {
        return reportId;
    }

    public void setReportId(long reportId) {
        this.reportId = reportId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TestReport [reportId=" + reportId + ", patientName=" + patientName + ", reportType=" + reportType
                + ", result=" + result + "]";
    }

}
