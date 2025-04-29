package com.example.student_management.controller;

import com.example.student_management.model.Student;
import com.example.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Change Long to String for MongoDB
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {  // Change Long to String
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    // Change Long to String for MongoDB
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {  // Change Long to String
        return studentService.updateStudent(id, student);
    }

    // Change Long to String for MongoDB
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {  // Change Long to String
        studentService.deleteStudent(id);
    }
}
