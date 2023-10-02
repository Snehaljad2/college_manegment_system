package com.backend.college_manegment_system.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.college_manegment_system.pages.loginpage;
import com.backend.college_manegment_system.repository.collegerepository;
@Service
public class collegeservices  {
	@Autowired
    private collegerepository collegerepository;

    public List<loginpage> findAll() {
        return collegerepository.findAll();
    }

    public loginpage findById(Long roll_no) {
        return collegerepository.findById(roll_no).orElse(null);
    }

    public void save(loginpage loginpage) {
        collegerepository.save(loginpage);
    }

    
	    
}
