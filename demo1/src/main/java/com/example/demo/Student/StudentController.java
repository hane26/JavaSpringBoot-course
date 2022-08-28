package com.example.demo.Student;
// this class will have all of our ressources for the API

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// this is like the api layer, it will talk to the service layer which is "StudentService" and same thing goes for the service
@RestController // we add this everytime we use a controller
@RequestMapping(path = "api/v1/Student") // when we're in the localHost we have to specify this path so that it would work
public class StudentController {

    private final StudentService studentService;

    @Autowired // we're using this to avoid problems f studentService lewla mea the one in the methode parameters
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping // so that the methode would work
    public List<Student> getStudents () {
            return studentService.getStudents();
    }


    // post request
    // we take the student from the request body, and then we map it
    @PostMapping
    public void registerNeStudent(@RequestBody Student student){
        studentService.addNewStudent(student);

    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
    }
  }
