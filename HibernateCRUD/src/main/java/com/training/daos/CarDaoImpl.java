package com.training.daos;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Car;
import com.training.utils.HiberUtils;

public class CarDaoImpl {

    private SessionFactory factory;

    public CarDaoImpl() {
        super();

        factory = HiberUtils.getSessionFactory();

    }

    public Object add(Car object) {
        // TODO Auto-generated method stub

        String key = null;

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        key = (String) session.save(object);

        tx.commit();

        return key;
    }

    public Car find(Serializable key) {

        Session session = factory.openSession();
        Car obtained_car = (Car) session.get(Car.class, key);

        return obtained_car;

    }

}
