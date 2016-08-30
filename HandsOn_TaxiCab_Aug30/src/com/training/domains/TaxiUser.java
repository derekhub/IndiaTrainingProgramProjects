package com.training.domains;

public class TaxiUser {

    private String name;
    private String email;
    private String password;
    private int telephone;
    private String city;

    public TaxiUser() {
        super();
    }

    public TaxiUser(String name, String email, String password, int telephone, String city) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.city = city;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
