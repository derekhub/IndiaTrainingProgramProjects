package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example2.MyDataSource;

@SpringBootApplication
@ComponentScan(basePackages = "com.example, com.example2") // NEED THIS BECAUSE
                                                           // SOME OF THE CODE
                                                           // NOT IN SAME
                                                           // PACKAGE
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootExampleApplication.class, args);

        Book cust = ctx.getBean(Book.class);

        System.out.println(cust);

        // RestTemplate template = ctx.getBean(RestTemplate.class);
        //
        // String response =
        // template.getForObject("http://localhost:5050/findAll", String.class);
        //
        // System.out.println(response);

        MyDataSource dataSource = ctx.getBean(MyDataSource.class);

        System.out.println(dataSource);

    }
}
