package com.example.gestion_de_cours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GestionDeCoursApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDeCoursApplication.class, args);
    }

}
