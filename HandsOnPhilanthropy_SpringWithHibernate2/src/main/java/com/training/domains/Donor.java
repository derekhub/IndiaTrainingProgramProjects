package com.training.domains;

import org.springframework.stereotype.Component;

@Component
public class Donor {

    private long handPhone;
    private String donorName;
    private String email;
    private Address address;

    public Donor() {
        super();
    }

    public Donor(long handPhone, String donorName, String email, Address address) {
        super();
        this.handPhone = handPhone;
        this.donorName = donorName;
        this.email = email;
        this.address = address;
    }

    public long getHandPhone() {
        return handPhone;
    }

    public void setHandPhone(long handPhone) {
        this.handPhone = handPhone;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Donor [handPhone=" + handPhone + ", donorName=" + donorName + ", email=" + email + ", address="
                + address + "]";
    }

}
