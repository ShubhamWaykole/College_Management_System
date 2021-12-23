package com.ventures.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventures.cms.model.Student;
import com.ventures.cms.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudent(Long regNo) {
		Student s = studentRepository.getById(regNo);
		return s;
	}

}
