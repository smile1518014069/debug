package com.entity;

public class User {
	private String id;
	private String nickname;
	private String passward;
	private String telephone;
public User() {
		
	}
	public User( String nickname, String passward) {
		
		this.nickname = nickname;
		this.passward = passward;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}
