package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Student;
import com.masai.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student updateStudent(Long id, String email) {
		
		Student st= studentRepository.findById(id).
				orElseThrow(()-> new RuntimeException("student not found"));
		st.setEmail(email);
		return studentRepository.save(st);
	}

}
