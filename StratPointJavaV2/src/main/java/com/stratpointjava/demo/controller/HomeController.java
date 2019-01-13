package com.stratpointjava.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stratpointjava.demo.StratPointJavaApplication;

@Controller
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(StratPointJavaApplication.class);
	
	@RequestMapping("/home")
	public String home() {
		log.info("Home Page Loaded");
		return "index";
	}

}
