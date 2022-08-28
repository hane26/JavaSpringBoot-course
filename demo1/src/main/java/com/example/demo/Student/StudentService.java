package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// for the server
@Service  // @Service and @Component are exactly the same thing
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    public List<Student> getStudents () {
        return studentRepository.findAll();// this returns a list of all data
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
