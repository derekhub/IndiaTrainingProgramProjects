package com.training.models;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StatusFinder {

    private HashMap<Long, List<PaymentStatus>> paymentHistory;

    public StatusFinder() {
        super();

        paymentHistory = new HashMap<Long, List<PaymentStatus>>();

    }

    private void init() {
        List<PaymentStatus> list1 = new ArrayList<PaymentStatus>();

        PaymentStatus pmt1 = new PaymentStatus(1000, new Timestamp(new Date(0).getTime()), "pizzahut", 450.00);
        PaymentStatus pmt2 = new PaymentStatus(1002, new Timestamp(new Date(0).getTime()), "blahhut", 250.00);
        PaymentStatus pmt3 = new PaymentStatus(1004, new Timestamp(new Date(0).getTime()), "tatahut", 150.00);

        list1.add(pmt1);
        list1.add(pmt2);

        paymentHistory.put(304304304L, list1);

    }

    public List<PaymentStatus> getPaymentHistory(Long key) {
        init();
        return paymentHistory.get(key);
    }

}