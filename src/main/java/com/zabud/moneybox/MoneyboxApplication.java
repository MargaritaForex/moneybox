package com.zabud.moneybox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MoneyboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyboxApplication.class, args);
    }

}
