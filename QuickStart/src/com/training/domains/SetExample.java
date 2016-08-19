package com.training.domains;

import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        TreeSet<CreditCard> cardList = new TreeSet<CreditCard>();
        
        cardList.add(new CreditCard(101, "Ramesh", 75000));
        cardList.add(new CreditCard(102, "gyu", 85000));

        
        System.out.println(cardList);
        
    }

}
