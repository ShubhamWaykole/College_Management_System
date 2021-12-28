package com.ventures.cms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ventures.cms.model.Department;
import com.ventures.cms.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Department> create(@RequestBody Department dept) {
		return new ResponseEntity<Department>(departmentService.createDepartment(dept), HttpStatus.OK);
	}
}
