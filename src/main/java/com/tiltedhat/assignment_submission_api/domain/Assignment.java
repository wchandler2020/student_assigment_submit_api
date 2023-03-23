package com.tiltedhat.assignment_submission_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_assignments")
public class Assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	private String githubUrl;
	private String branch;
	private String codeReviewvideoUrl;
	@ManyToOne(optional=true)
	private User user;
	// TODO: create private User assignedTo;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
	public Long getId() {
		return id;
	}
	public Assignment(Long id, String status, String githubUrl, String branch, String codeReviewvideoUrl) {
		super();
		this.id = id;
		this.status = status;
		this.githubUrl = githubUrl;
		this.branch = branch;
		this.codeReviewvideoUrl = codeReviewvideoUrl;
	}
	
	public Assignment() {
		super();
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getGithubUrl() {
		return githubUrl;
	}
	
	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getCodeReviewvideoUrl() {
		return codeReviewvideoUrl;
	}
	
	public void setCodeReviewvideoUrl(String codeReviewvideoUrl) {
		this.codeReviewvideoUrl = codeReviewvideoUrl;
	}
	
	
}
