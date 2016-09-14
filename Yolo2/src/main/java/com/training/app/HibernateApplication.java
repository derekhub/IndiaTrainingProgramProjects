package com.training.app;

import com.training.daos.AddressDao;
import com.training.daos.DonorDao;
import com.training.domains.Address;

public class HibernateApplication {

    public static void main(String[] args) {

        AddressDao aDao = new AddressDao();
        DonorDao dDao = new DonorDao();

        int addressTest = 1;

        if (addressTest == 0) {
            // ADDING ADDRESS----------------------
            try {
                Address add1 = new Address("Ghandi street", "happy city", "toronto", 12345);
                Address add2 = new Address("lol street", "lol city", "toronto", 88888);
                System.out.println(aDao.add(add1));
                System.out.println(aDao.add(add2));

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        if (addressTest == 1) {
            try {
                System.out.println(aDao.find("lol street"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        if (addressTest == 2) {
            try {
                System.out.println(aDao.findAll());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}
