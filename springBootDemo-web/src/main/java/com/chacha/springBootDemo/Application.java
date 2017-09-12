package com.chacha.springBootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
@SpringBootApplication
@MapperScan("com.chacha.springBootDemo.dao.dal")
public class Application {

    public static void main (String[] args) {

        new SpringApplicationBuilder()
                .showBanner(true)
                .sources(Application.class)
                .run(args);
    }
}
