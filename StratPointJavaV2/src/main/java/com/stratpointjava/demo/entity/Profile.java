package com.stratpointjava.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Profile {
	private String id;
	private boolean active;
	private boolean blocked;
	private String balance;
	private String picture;
	private int age;
	private ProfileName name;
	private String email;
	private String phone;
	private String address;
	private String profile;
	private int dateRegistered;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getDateRegistered() {
		return dateRegistered;
	}
	public void setDateRegistered(int dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	
	public ProfileName getName() {
		return name;
	}

	public void setName(ProfileName name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", active=" + active + ", blocked=" + blocked + ", profile=" + profile
				+ ", dateRegistered=" + dateRegistered + "]";
	}

}
