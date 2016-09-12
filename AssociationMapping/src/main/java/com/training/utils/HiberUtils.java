package com.training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtils {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        if (factory == null) {

            factory = new Configuration().configure().buildSessionFactory();

            System.out.println("debug");
        }

        return factory;
    }

    public static void closeFactory() {

        factory.close();
    }

}
