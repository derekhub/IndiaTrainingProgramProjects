package com.training.domains;

import java.util.Set;

public class Project {

    private long projectId;
    private String projectName;
    private double projectBudget;
    private double amountCollected;
    private Set<Donor> donorList;

    public Project() {
        super();
    }

    public Project(long projectId, String projectName, double projectBudget, double amountCollected,
            Set<Donor> donorList) {
        super();
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectBudget = projectBudget;
        this.amountCollected = amountCollected;
        this.donorList = donorList;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(double projectBudget) {
        this.projectBudget = projectBudget;
    }

    public double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Set<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(Set<Donor> donorList) {
        this.donorList = donorList;
    }

    @Override
    public String toString() {
        return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectBudget=" + projectBudget
                + ", amountCollected=" + amountCollected + "]";
    }

}
