package com.Desafio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio2Application implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Desafio2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("System started..");
    }
}
