package com.jack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.jack.mapper")
//@EnableTransactionManagement
//@EnableScheduling
public class Mybatis {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis.class, args);
    }

}
