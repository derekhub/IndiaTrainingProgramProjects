package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.CustomerDao;
import com.training.entity.Customer;
import com.training.ifaces.MyDao;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")) {

            MyDao<Customer> dao = ctx.getBean(CustomerDao.class);

            // ADD-----------------------------------------------------------------
            // Customer cust = ctx.getBean(Customer.class);
            //
            // cust.setCustomerNumber(1);
            // cust.setCustomerName("Derek");
            // cust.setEmail("a@hotmail.com");
            // cust.setPhoneNUmber(123123123);
            //
            // int rowsInserted = dao.add(cust);
            //
            // System.out.println(rowsInserted);

            // FIND-----------------------------------------------------------------
            // System.out.println(dao.find(1));

            // FIND
            // ALL-----------------------------------------------------------------
            for (Customer c : dao.findAll()) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
