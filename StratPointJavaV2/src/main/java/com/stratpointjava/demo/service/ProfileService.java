package com.stratpointjava.demo.service;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stratpointjava.demo.controller.ProfileRestController;
import com.stratpointjava.demo.entity.Profile;

@Service
public class ProfileService {
	
	private static final Logger log = LoggerFactory.getLogger(ProfileRestController.class);

	private List<Profile> profileList;
	
	public ProfileService(@Value("${profile.service.url}") String profileUrl) throws JsonParseException, JsonMappingException, IOException  {
		log.info(profileUrl);
		log.info("service-profileService");
		
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(profileUrl, String.class);
		
		profileList = mapper.readValue(responseEntity.getBody(), new TypeReference<List<Profile>>(){});
	}
	
	public List<Profile> getAllProfiles(){
		log.info("service-getAllProfiles");
		return profileList;
	}
	
	public Profile getProfile(String id){
		log.info("service-getProfile - " + id);
		Profile chosen = new Profile();
		for (Profile p : profileList) {
			if (id.equals(p.getId())) {
				chosen = p;
			}
		}
		return chosen;
	}
}
