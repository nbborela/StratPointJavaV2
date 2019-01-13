package com.stratpointjava.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stratpointjava.demo.entity.Profile;
import com.stratpointjava.demo.service.ProfileService;


@RestController
public class ProfileRestController {

	private static final Logger log = LoggerFactory.getLogger(ProfileRestController.class);

	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/api/profiles")
	public List<Profile> getAllProfiles() {
		log.info("controller-getAllProfiles");
		return profileService.getAllProfiles();
	}
	
	@RequestMapping("/api/profiles/{id}")
	public Profile getProfiles(@PathVariable String id){
		log.info("controller-getProfiles");
		return profileService.getProfile(id);
	}
}
