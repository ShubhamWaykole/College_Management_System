package com.ventures.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventures.cms.model.Class;
import com.ventures.cms.repository.ClassRepository;

@Service
public class ClassService {

	@Autowired
	ClassRepository classRepository;

	public Class createClass(Class cls) {
		return classRepository.save(cls);
	}

	public Class getClass(Long id) {
		return classRepository.getById(id);
	}
}
