package com.tiltedhat.assignment_submission_api.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User {
	@Id
	private Long id;
	private LocalDate cohortStartDate;
	private String username;
	private String password;	
	
	public User(Long id, LocalDate cohortStartDate, String username, String password) {
		super();
		this.id = id;
		this.cohortStartDate = cohortStartDate;
		this.username = username;
		this.password = password;
	}
	
	
	public User() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getCohortStartDate() {
		return cohortStartDate;
	}
	public void setCohortStartDate(LocalDate cohortStartDate) {
		this.cohortStartDate = cohortStartDate;
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

	
	
	
}
