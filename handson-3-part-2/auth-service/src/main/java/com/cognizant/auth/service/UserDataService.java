package com.cognizant.auth.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.auth.model.AppUser;

@Service
public interface UserDataService {
   public void addUser();
   public ArrayList<AppUser> getUserNameAndPassword();
}
