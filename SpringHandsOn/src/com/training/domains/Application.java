package com.training.domains;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")) {

            Invoice invoice = ctx.getBean(Invoice.class);

            System.out.println(invoice.toString());

            // System.out.println("Customer ID:= " +
            // insurance.getCust().getCustomerId());
            // System.out.println("Customer name:= " +
            // insurance.getCust().getCustomerName());
            // System.out.println("Policy Number := " +
            // insurance.getPolicyNumber());
            // System.out.println("Policy Amount := " +
            // insurance.getPolicyAmount());
            // System.out.println("First Premium := " +
            // insurance.findFirstPremium());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}