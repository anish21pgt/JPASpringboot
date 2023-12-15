package com.jpaspringboot.jpaspringboot.controller;

import com.jpaspringboot.jpaspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jpaspringboot.jpaspringboot.modal.Student;
import java.util.ArrayList;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addAll")
    public void add() {
        studentService.addStudent();
    }


    @GetMapping("/findall")
    public ArrayList<Student> getAllStudent(){
        return studentService.findAllStudent();
    }

    @GetMapping("/findAll/{id}")
        public Student getStudentUsingId(@PathVariable long id) {
            return studentService.findStudentByID(id);
        }
    @DeleteMapping("/delete")
    public void delete(){
        studentService.deleteAllData();
    }
}
