package com.example.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    @Id
    private Long id;
    private String name;
    private int age;
    private String email;

    // Getters and setters
}
