package com.ventures.cms.rest;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ventures.cms.model.Student;
import com.ventures.cms.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Student> create(@RequestBody Student student) {
		Student stu = null;
		try {
			stu = studentService.createStudent(student);
		} catch (Exception e) {
			System.out.println("Exception caught while creating the student: " + e.getMessage());
			e.printStackTrace();
		}
		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Student> get(@PathVariable Long id) {
		Student stu;
		try {
			stu = studentService.getStudent(id);
		} catch (EntityNotFoundException e) {
			System.out.println("Exception caught while fetching student details|: " + e.getMessage());
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
	}
}
