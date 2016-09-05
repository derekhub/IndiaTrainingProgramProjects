package com.training.ifaces;

import java.util.List;

import com.training.entity.Customer;

public interface MyDao<T> {

    public int add(Customer object);

    public T find(long key);

    public List<T> findAll();

}
