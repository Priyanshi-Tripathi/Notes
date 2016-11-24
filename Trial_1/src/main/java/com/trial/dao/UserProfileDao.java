package com.trial.dao;

import java.util.List;

import com.trial.dto.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();
    
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
	
}
