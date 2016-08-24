package com.training.examplelol;

public class ValidateBean {

    User u = new User();

    public void init() {
        u = new User("derek", "choi");
    }

    public boolean validate(String username, String password) {

        init();

        if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
            return true;
        } else {
            return false;
        }

    }

}
