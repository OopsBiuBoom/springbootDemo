package com.bii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 标识主程序类
@SpringBootApplication
public class HelloMainApplication {

    public static void main(String[] args) {
        // 第一个参数是当前类，第二个参数是main函数的参数
        SpringApplication.run(HelloMainApplication.class, args);
    }
}
