package com.ventures.cms.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventures.cms.model.Student;
import com.ventures.cms.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(Student student) throws Exception {
		return studentRepository.save(student);
	}

	public Student getStudent(Long regNo) {
		Student stu = studentRepository.findById(regNo)
				.orElseThrow(() -> new EntityNotFoundException("Student not found with reg. no. : " + regNo));
		return stu;
	}

}
