package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);
        System.out.println("JVM最大内存量：" + runtime.maxMemory());
        SpringApplication.run(DemoApplication.class, args);




    }

}
