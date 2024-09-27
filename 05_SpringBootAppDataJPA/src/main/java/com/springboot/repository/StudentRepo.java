package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.entities.Student;

//public interface StudentRepo extends CrudRepository<Student, Integer>
public interface StudentRepo extends JpaRepository<Student, Integer>
{
	Student findByStudName(String studName);
	
	Student findByStudAddr(String studAddr);
	
	Student findByStudNameAndStudAddr(String studName, String studAddr);
	
	@Query("select s from Student s where s.studName=?1 and s.studAddr=?2")
	Student getByStudNameAndStudAddr(String studName, String studAddr);
	
	List<Student> findByOrderByStudNameDesc();
}
