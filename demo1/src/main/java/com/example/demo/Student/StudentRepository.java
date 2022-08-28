package com.example.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// this interface is responsible for data access that is why we are using it
// we want to use this interface inside our StudentService
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
