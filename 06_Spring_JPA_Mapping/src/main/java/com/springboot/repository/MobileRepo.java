package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Mobile;

public interface MobileRepo extends JpaRepository<Mobile, Integer>{

}
