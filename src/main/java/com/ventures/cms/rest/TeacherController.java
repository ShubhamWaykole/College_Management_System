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
import com.ventures.cms.model.Teacher;
import com.ventures.cms.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherService teacherService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Teacher> create(@RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(teacherService.createTeacher(teacher), HttpStatus.OK);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Teacher> get(@PathVariable Long id) {
		return new ResponseEntity<Teacher>(teacherService.getTeacher(id), HttpStatus.OK);
	}

}
