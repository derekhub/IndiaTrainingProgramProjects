package com.training.domains;

import java.util.Arrays;
import java.util.Hashtable;

public class MapExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Hashtable<String, CreditCard> list = new Hashtable<String, CreditCard>();
        
        list.put("A101", new CreditCard(101, "Ramesh", 75000));
        Object obj = list.put("A101", new CreditCard(101, "Rakesh", 75000));
        
        System.out.println(obj);
        
        list.put("A102", new CreditCard(102, "John", 175000));
        list.put("A103", new CreditCard(103, "Jeyesh", 175000));


        System.out.println(list.get("A101"));
        
        list.entrySet();
        
        int[] ar = new int[5];
        Arrays.fill(ar, 55);
        
        for (int x: ar){
            System.out.println(x);
        }
        
        
        
    }

}
