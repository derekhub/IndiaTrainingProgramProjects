package com.training.entity;

public class Donor {

    private String name;
    private String email;
    private int donorId;
    // private HashMap <String, Project> donationList = new HashMap <String,
    // Project>();

    public Donor() {

    }

    public Donor(int donorId, String name, String email) {
        this.donorId = donorId;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    // public HashMap<String, Project> getDonationList() {
    // return donationList;
    // }
    //
    // public void addProjectToDonationList(Project project){
    //
    // if (!donationList.containsKey(project.getName())){
    // donationList.put(project.getName(), project);
    // }
    //
    //
    // }

}
