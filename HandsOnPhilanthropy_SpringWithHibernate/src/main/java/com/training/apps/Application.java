package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.DonorDao;
import com.training.domains.Donor;

public class Application {

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
            System.out.println("debug");

            DonorDao dao = ctx.getBean(DonorDao.class);
            Donor donor = ctx.getBean("donorBean1", Donor.class);

            System.out.println(donor);

            System.out.println(dao.add(donor));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
