package com.edwin.BackendToDo.model;

import javax.persistence.Entity;

@Entity
public class User {
	private int id;
	private String name;
	private String email;
	private String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String name, String email, String username) {
		this.setName(name);
		this.email = email;
		this.username = username;
	}
	public User() {}
}
