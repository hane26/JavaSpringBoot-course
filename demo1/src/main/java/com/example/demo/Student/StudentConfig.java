package com.example.demo.Student;

// this class will help to add students to the database

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student meriam = new Student(
                    "Meriem",
                    "meriem@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY,26)

            );

           Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY,12)

            );

            // this is 👇 how to save in the database
            repository.saveAll(
                    List.of(meriam,alex)
            );
        };
    }
}



// SO WE HAVE ;
// from the API Layer get request gives us a list of students
// service layer for the business logic
// data access layer for the database access

//---- http methods ---
// we have ;  GET - POST - DELETE - PUT
// GET basically with it, we get students
// POST is to save more students in the database
// DELETE is to delete students from the database

//---- POST Request ----
// for our post request we want ot send a certain student,
// and with it, we want to check first that the email doesn't exist
// and if it exists we need to throw an exception




