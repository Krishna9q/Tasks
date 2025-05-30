package com.example.student.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repo.StudentRepo;
import com.example.student.request.StudentRequest;
import com.example.student.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student addStudent(StudentRequest studentRequest) {
        log.info("Adding new student: {}", studentRequest);
        Student s1 = new Student();
        s1.setName(studentRequest.getName());
        s1.setAge(studentRequest.getAge());
        s1.setEmail(studentRequest.getEmail());
        s1.setId(studentRequest.getId());

        Student savedStudent = studentRepo.save(s1);
        log.info("Student added successfully: {}", savedStudent);
        return savedStudent;
    }

    @Override
    public List<Student> getAllStudent() {
        log.info("Fetching all students");
        List<Student> students = studentRepo.findAll();
        log.info("Total students found: {}", students.size());
        return students;
    }

    @Override
    public Student updaStudent(Long id, StudentRequest studentRequest) {
        log.info("Updating student with id: {}", id);
        Student existingStudent = studentRepo.findById(id).orElse(null);
        if (existingStudent == null) {
            log.warn("Student not found with id: {}", id);
            return null;
        }
        existingStudent.setName(studentRequest.getName());
        existingStudent.setAge(studentRequest.getAge());
        existingStudent.setEmail(studentRequest.getEmail());
        Student updatedStudent = studentRepo.save(existingStudent);
        log.info("Student updated successfully: {}", updatedStudent);
        return updatedStudent;
    }

    @Override
    public String deleteStudent(Long id) {
        log.info("Deleting student with id: {}", id);
        if (!studentRepo.existsById(id)) {
            log.warn("Student not found with id: {}", id);
            return "Student not found";
        }
        studentRepo.deleteById(id);
        log.info("Student deleted successfully with id: {}", id);
        return "Student deleted successfully";
    }

    @Override
    public Student getById(Long id) {
        log.info("Fetching student by id: {}", id);
        Student s1 = studentRepo.findById(id)
                .orElseThrow(() -> {
                    log.error("Student not found with id: {}", id);
                    return new RuntimeException("Student not found with id:" + id);
                });
        log.info("Student found: {}", s1);
        return s1;
    }

}
