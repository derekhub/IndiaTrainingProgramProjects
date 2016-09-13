package com.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("deve")
public class DevelopmentConfiguration {

    @Bean
    public MyDataSource developmentDb() {

        return new MyDataSource("Derby", "DerbyURL");
    }

}