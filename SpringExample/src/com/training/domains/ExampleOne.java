package com.training.domains;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleOne {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")) {
            // Patient patientBean = ctx.getBean(Patient.class);
            // System.out.println("Bean returned by IoC Container: " +
            // patientBean);
            // System.out.println("Hashcode of patient bean: " +
            // patientBean.hashCode());
            // Patient patientBean2 = ctx.getBean(Patient.class);
            // System.out.println("Hashcode of patient bean2: " +
            // patientBean.hashCode());
            // System.out.println("\n\n");
            // ---------------------------------
            Patient patientBean = ctx.getBean("patBean1", Patient.class);
            System.out.println("Bean returned by IoC Container: " + patientBean);
            System.out.println("Hashcode of patient bean: " + patientBean.hashCode());
            Doctor doctor = ctx.getBean("docBean1", Doctor.class);
            System.out.println("Doctor := " + doctor);
            System.out.println("Patient := " + patientBean);

            // list----------------------------------
            Doctor doctor2 = ctx.getBean("docBean2", Doctor.class);
            System.out.println(doctor2);
            System.out.println(doctor2.getPatientList().toString());

            // hashmap----------------------------------
            Doctor mapDoctor = ctx.getBean("mapDoctor", Doctor.class);
            System.out.println(mapDoctor.getSupportStaff().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
