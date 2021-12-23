package com.ventures.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventures.cms.model.Department;
import com.ventures.cms.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public Department createDepartment(Department dept) {
		return departmentRepository.save(dept);
	}

}
