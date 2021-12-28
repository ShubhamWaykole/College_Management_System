package com.ventures.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventures.cms.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}