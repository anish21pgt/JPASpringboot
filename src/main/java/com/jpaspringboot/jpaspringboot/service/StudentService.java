package com.jpaspringboot.jpaspringboot.service;

import com.jpaspringboot.jpaspringboot.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

import com.jpaspringboot.jpaspringboot.modal.Student;

@Service
public class StudentService{
    @Autowired
    StudentRepository studentRepository;

    public ArrayList<Student> findAllStudent(){
        return (ArrayList<Student>) studentRepository.findAll();
    }

    public Student findStudentByID(long Id){
        Optional <Student> opt = studentRepository.findById(Id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }

    public void addStudent() {
        ArrayList<Student> stud = new ArrayList<Student>();
        stud.add(new Student("Harry", "Melbourne", 97));
        stud.add(new Student("Xiang", "Beijing", 73));
        stud.add(new Student("William", "California", 85));
        stud.add(new Student("Rony", "London", 63));

        for (Student student : stud) {
            studentRepository.save(student);
        }
    }

    public void deleteAllData() {
        studentRepository.deleteAll();
    }

}