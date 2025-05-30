package com.example.student.service;

import java.util.List;

import com.example.student.entity.Student;
import com.example.student.request.StudentRequest;

public interface StudentService {
    
    Student addStudent(StudentRequest studentRequest);

    List<Student> getAllStudent();

    Student getById (Long id);
    
    Student updaStudent(Long id , StudentRequest studentRequest );

    String deleteStudent(Long id);

}



    
