package com.wujp;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired  //开启自动注入
    private DataSource dataSource;
    @Test
    public void contextLoads() throws SQLException {
        //DataSource:class com.zaxxer.hikari.HikariDataSource
        System.out.println("\nDataSource:" + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        //HikariProxyConnection@749362556 wrapping com.mysql.cj.jdbc.ConnectionImpl@5e671e20
        System.out.println("****************************:" + connection);
        connection.close();
    }

}
