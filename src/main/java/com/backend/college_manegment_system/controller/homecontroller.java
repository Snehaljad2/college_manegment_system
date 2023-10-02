package com.backend.college_manegment_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {
	 @GetMapping("/")
	    public String home() {
	        return "redirect:/loginpage";
	    }
}
