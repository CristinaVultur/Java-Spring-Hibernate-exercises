package com.example.lab3ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab3ex1Application {
    /*
    model - reprezentarea datelor in formatul de buissines, baze de date
    view - interfata
    controller - face legatura dintre model si view

    repository- se ocupa cu aducerea datelor din bd intr-un format intteles de java
    service - toata procesarea de biusiness
     */

    public static void main(String[] args) {
        SpringApplication.run(Lab3ex1Application.class, args);
    }

}
