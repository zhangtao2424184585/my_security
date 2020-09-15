package com.example.qiemian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy()
public class QiemianApplication {

    public static void main(String[] args) {
        SpringApplication.run(QiemianApplication.class, args);
    }

}
