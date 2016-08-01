package com.training;


public class Example_Five {
    private String name = "Ramesh";
    public void show(String user) {
        if (user.equals(name)) {
            System.out.println("Valid User");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example_Five obj = new Example_Five();
        /**
         * Its not printing validation Message - Fix the Bug
         */
        obj.show(new String("Ramesh"));
    }
}
