package com.training;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Donor;
import com.training.domains.Project;

@SpringBootApplication
public class HandsOnPhilanthropySpringCoreApplication {

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")) {

            Donor donorBean = ctx.getBean(Donor.class);
            Project projectBean = ctx.getBean(Project.class);

            System.out.println();
            System.out.println(donorBean);
            System.out.println(projectBean);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
