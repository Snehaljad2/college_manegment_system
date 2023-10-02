package com.backend.college_manegment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.college_manegment_system.services.collegeservices;


@Controller
@RequestMapping("/loginpage")
public class collegecontroller {
	    @Autowired
	    private collegeservices collegeservice;
	   
	    @GetMapping
	    public String loginpage(Model model) {
	        model.addAttribute("loginpage", collegeservice.findAll());
	        return "college/loginpage";
	    }

	    

	}


