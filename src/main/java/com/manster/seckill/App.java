package com.manster.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.manster.seckill"})
@MapperScan("com.manster.seckill.dao")
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }

}
