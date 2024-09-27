package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
