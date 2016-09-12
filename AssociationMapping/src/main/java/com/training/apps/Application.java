package com.training.apps;

import java.util.HashSet;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.training.entity.Participant;
import com.training.entity.Training;
import com.training.utils.HiberUtils;

public class Application {

    public static void main(String[] args) {

        Participant part1 = new Participant(101, "Derek");
        Participant part2 = new Participant(202, "Nate");
        Participant part3 = new Participant(303, "Michelle");

        HashSet<Participant> list = new HashSet<Participant>();

        list.add(part1);
        list.add(part2);
        list.add(part3);

        Training training1 = new Training(111, "Agam", list);

        SessionFactory factory = HiberUtils.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(training1);
        tx.commit();

    }

}
