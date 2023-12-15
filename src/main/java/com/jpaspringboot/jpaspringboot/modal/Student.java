package com.jpaspringboot.jpaspringboot.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String city;

    private int marks;

    public Student() {
        super();
    }

    public Student(String name, String city, int marks) {
        super();
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

}
