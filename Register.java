package com.register;

public class Register {
	private String reg_user_name;
	private String reg_email;
	private String reg_Password;
	public String getReg_user_name() {
		return reg_user_name;
	}
	public void setReg_user_name(String reg_user_name) {
		this.reg_user_name = reg_user_name;
	}
	public String getReg_email() {
		return reg_email;
	}
	public void setReg_email(String reg_email) {
		this.reg_email = reg_email;
	}
	public String getReg_Password() {
		return reg_Password;
	}
	public void setReg_Password(String reg_Password) {
		this.reg_Password = reg_Password;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String reg_user_name, String reg_email, String reg_Password) {
		super();
		this.reg_user_name = reg_user_name;
		this.reg_email = reg_email;
		this.reg_Password = reg_Password;
	}
	@Override
	public String toString() {
		return "Register [\nreg_user_name:" + reg_user_name + ",\n reg_email:" + reg_email + ", \n reg_Password:"
				+ reg_Password + "]";
	}
	
	

}
