package com.example.student.request;

import lombok.Data;

@Data
public class StudentRequest {
    private Long id;
    private String name;
    private int age;
    private String email;
}
