package com.electronics;

import java.util.Objects;

public class Login {

	private String user_name;
	private String password;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String user_name, String password) {
		super();
		this.user_name = user_name;
		this.password = password;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(password, user_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(password, other.password) && Objects.equals(user_name, other.user_name);
	}
	@Override
	public String toString() {
		return "Login [\nuser_name:" + user_name + ", \npassword:" + password + "]";
	}
	
	
}
