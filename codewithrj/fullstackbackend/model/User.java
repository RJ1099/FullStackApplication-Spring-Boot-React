package com.codewithrj.fullstackbackend.model;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name",nullable = false)
	private String username;
	
	@Column(name = "name",nullable = false)
	private String name;
	
	@Column(name = "email",nullable = false)
	private String email;
	
	@Column(name="user_created_time")
	@CreationTimestamp
	private LocalDateTime userCreatedTime;
	
	@Column(name = "user_last_updated")
	@UpdateTimestamp
	private LocalDateTime userLastUpdated;
	
	
	public Long getId() {
		return id;
	}
	public LocalDateTime getUserCreatedTime() {
		return userCreatedTime;
	}
	public void setUserCreatedTime(LocalDateTime userCreatedTime) {
		this.userCreatedTime = userCreatedTime;
	}
	public LocalDateTime getUserLastUpdated() {
		return userLastUpdated;
	}
	public void setUserLastUpdated(LocalDateTime userLastUpdated) {
		this.userLastUpdated = userLastUpdated;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
