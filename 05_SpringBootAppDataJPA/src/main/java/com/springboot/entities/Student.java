package com.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studId;
	
	private String studName;
	
	private String studAddr;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAddr() {
		return studAddr;
	}

	public void setStudAddr(String studAddr) {
		this.studAddr = studAddr;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAddr=" + studAddr + "]";
	}
	
	
}
