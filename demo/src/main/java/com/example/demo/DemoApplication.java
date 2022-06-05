package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        LinkedList a = new LinkedList<String>();
        a.size();
        SpringApplication.run(DemoApplication.class, args);
    }

}
