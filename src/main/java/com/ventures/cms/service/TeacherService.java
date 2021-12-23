
package com.ventures.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventures.cms.model.Teacher;
import com.ventures.cms.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepository;

	public Teacher createTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

}
