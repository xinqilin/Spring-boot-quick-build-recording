package com.bill.springbootquick;

import com.bill.springbootquick.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringBootQuickBuildApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        try {
            System.out.println(dataSource.getClass());
            Connection con=dataSource.getConnection();
            System.out.println(con);
            con.close();
        }catch (SQLException se){
            System.err.println(se.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }

}
