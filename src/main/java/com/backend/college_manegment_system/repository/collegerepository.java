package com.backend.college_manegment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.college_manegment_system.pages.loginpage;



@Repository
public interface collegerepository extends JpaRepository<loginpage, Long>  {

}
