package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.DonorDao;
import com.training.daos.ProjectDao;
import com.training.domains.Donor;
import com.training.domains.Project;

public class Application {

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

            DonorDao dDao = ctx.getBean(DonorDao.class);
            ProjectDao pDao = ctx.getBean(ProjectDao.class);

            Donor donor = ctx.getBean("donorBean1", Donor.class);
            Project project = ctx.getBean("projectBean1", Project.class);

            // TEST KEYS HERE
            int test = 4;

            // -----------------------------

            if (test == 1) {
                // add
                try {
                    System.out.println(dDao.add(donor));
                } catch (Exception e) {
                    System.out.println(e);
                }

                // find
            } else if (test == 2) {
                try {
                    System.out.println(dDao.find((long) 911));
                } catch (Exception e) {
                    System.out.println(e);
                }

                // find all
            } else if (test == 3) {
                try {
                    System.out.println(dDao.findAll());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            // -----------------------------------

            if (test == 4) {
                // add
                try {
                    System.out.println(pDao.add(project));
                } catch (Exception e) {
                    System.out.println(e);
                }

                // find
            } else if (test == 5) {
                try {
                    System.out.println(pDao.find((long) 1));
                } catch (Exception e) {
                    System.out.println(e);
                }

                // find all
            } else if (test == 6) {
                try {
                    System.out.println(pDao.findAll());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
