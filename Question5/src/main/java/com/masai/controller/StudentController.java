package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
    @Autowired
	private StudentService studentService;
    
    @PatchMapping("/student/{id}")
    public ResponseEntity<Student> updateStudentEmail(@PathVariable Long id, @PathVariable String email){
    	 return new ResponseEntity<Student>(studentService.updateStudent(id, email),HttpStatus.OK);
    }
}
