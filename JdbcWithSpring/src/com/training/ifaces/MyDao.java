package com.training.ifaces;

import com.training.entity.Customer;

public interface MyDao<T> {

    public int add(Customer object);

}
