package com.example.SpringTutorial22.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student bob = new Student(
                    1L,
                    "Bob",
                    "bob@gmail.com",
                    LocalDate.of(1776, Month.DECEMBER, 12)
            );
            Student tom = new Student(
                    "Tom",
                    "tom@gmail.com",
                    LocalDate.of(1492, Month.MAY, 19)
            );

            repository.saveAll(
                    List.of(bob, tom)
            );

        };
    }

}
