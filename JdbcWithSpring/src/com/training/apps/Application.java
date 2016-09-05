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

            Customer cust = ctx.getBean(Customer.class);

            cust.setCustomerNumber(2020);
            cust.setCustomerName("Ankit3");
            cust.setEmail("a@hotmail.com");
            cust.setPhoneNUmber(123123123);

            int rowsInserted = dao.add(cust);

            System.out.println(rowsInserted);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
