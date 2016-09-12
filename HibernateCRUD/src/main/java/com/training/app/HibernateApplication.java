package com.training.app;

import com.training.daos.CarDaoImpl;
import com.training.domains.Address;
import com.training.entity.Car;

public class HibernateApplication {

    public static void main(String[] args) {

        // ---Add---
        // CarDaoImpl dao = new CarDaoImpl();
        // Car car = new Car("bee", "123");
        // String hi = (String) dao.add(car);
        // System.out.println(hi);

        // ---Find---
        // System.out.println(dao.find("abc"));

        // ---Update---
        CarDaoImpl dao = new CarDaoImpl();
        Car car = new Car("cave", "123");

        Address resiAddr = new Address("Ghandi street", "happy city", "12345");
        Address officeAddr = new Address("lol street", "lol city", "88888");

        car.setOfficeAddress(officeAddr);
        car.setResiAddress(resiAddr);

        String key = (String) dao.add(car);
        System.out.println(dao.find(car.getRegisterNumber()));

    }

}
