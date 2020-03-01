package com.bill.springbootquick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;


@SpringBootApplication
public class SpringBootQuickBuildApplication {



    public static void main(String[] args) {

        SpringApplication.run(SpringBootQuickBuildApplication.class, args);

    }

}
