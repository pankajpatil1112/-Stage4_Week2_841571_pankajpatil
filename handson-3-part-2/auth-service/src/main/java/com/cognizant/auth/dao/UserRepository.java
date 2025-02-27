package com.cognizant.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.auth.model.AppUser;
@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer>{

}
