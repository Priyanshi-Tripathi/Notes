package com.trial.service;

import java.util.List;

import com.trial.dto.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);
	 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
	
}
