package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private int xdclass;
    private static final int TMF = 3;
    private String version = "v2";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("hello springboot!");
    }

    public int getXdclass() {
        return xdclass;
    }

    public void setXdclass(int xdclass) {
        this.xdclass = xdclass;
    }
}
