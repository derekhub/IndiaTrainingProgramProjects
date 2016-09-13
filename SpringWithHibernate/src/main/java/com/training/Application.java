package com.training;

import org.service.daos.ShoppingCartDao;
import org.service.entitiy.ShoppingCart;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        ShoppingCartDao dao = (ShoppingCartDao) ctx.getBean(ShoppingCartDao.class);
        ShoppingCart cart = ctx.getBean(ShoppingCart.class);

        cart.setCartId(2020);
        cart.setItem("smartphone");

        Integer key = (Integer) dao.add(cart);

        System.out.println("One cart added");

    }

}
