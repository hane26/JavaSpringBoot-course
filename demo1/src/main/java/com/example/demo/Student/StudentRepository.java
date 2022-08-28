package com.example.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

// this interface is responsible for data access that is why we are using it
// we want to use this interface inside our StudentService
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    @Query ("SELECT S FROM Student S WHERE S.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
