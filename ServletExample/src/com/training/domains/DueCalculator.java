package com.training.domains;

import java.util.HashMap;

public class DueCalculator {

    private HashMap<Long, Double> dueDetails;

    /**
     * Represents Business Service
     * 
     */

    public DueCalculator() {
        super();
        dueDetails = new HashMap<Long, Double>();
    }

    private void init() {
        dueDetails.put(99328938283L, 500.00D);
        dueDetails.put(99328938483L, 1500.00D);
        dueDetails.put(99328938683L, 2500.00D);
        dueDetails.put(99328938783L, 3500.00D);

    }

    public Double fineDue(Long phoneNumber) {

        init();
        Double result = dueDetails.get(phoneNumber);
        return result;

    }

}
