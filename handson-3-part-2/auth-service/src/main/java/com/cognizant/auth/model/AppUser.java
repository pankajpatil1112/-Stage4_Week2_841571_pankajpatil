package com.cognizant.auth.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//A (temporary) class represent the user saved in the database.
@Entity
public class AppUser {
	@Id
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String username, password;
	private String role;

	public AppUser(Integer id, String username, String password, String role) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public AppUser() {
		// TODO Auto-generated constructor stub
	}
	// getters and setters ....
}
