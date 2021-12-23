package com.ventures.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventures.cms.model.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {

}
