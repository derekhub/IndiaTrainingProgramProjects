package com.training.domains;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Utility serializer = new Utility();
        
        Invoice inv = new Invoice(101, "Ramesh", 4500);
        
        serializer.serialize(inv);

    }

}
