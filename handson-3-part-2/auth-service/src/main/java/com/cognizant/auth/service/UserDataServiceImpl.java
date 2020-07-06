package com.cognizant.auth.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.auth.dao.UserRepository;
import com.cognizant.auth.model.AppUser;
@Service
public class UserDataServiceImpl implements UserDataService {
	@Autowired
	UserRepository userRepository;

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		userRepository.save(new AppUser(1, "pankajpatil", "pankaj", "USER"));
		userRepository.save(new AppUser(2, "pratikpatil", "pratik", "ADMIN"));
	}

	@Override
	public ArrayList<AppUser> getUserNameAndPassword() {
		// TODO Auto-generated method stub
		ArrayList<AppUser> list = new ArrayList<>();
		
		userRepository.findAll().forEach(a -> list.add(a));
			System.out.println("hii ");
		return list;
	}

}
