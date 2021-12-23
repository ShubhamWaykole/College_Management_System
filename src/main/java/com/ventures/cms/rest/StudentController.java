package com.ventures.cms.rest;

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
		return new ResponseEntity<Student>(studentService.createStudent(student),HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Student> get(@PathVariable Long id) {
		return new ResponseEntity<Student>(studentService.getStudent(id), HttpStatus.OK);
	}

}
