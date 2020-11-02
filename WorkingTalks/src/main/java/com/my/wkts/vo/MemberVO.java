package com.my.wkts.vo;

public class MemberVO {
	String user_cd = "";
	String user_id = "";
	String user_pw = "";
	String user_name = "";
	String user_company = "";
	String user_depart = "";
	String user_position = "";
	String mail_addr = "";
	
	public MemberVO() {
	}

	public MemberVO(String user_cd, String user_id, String user_pw, String user_name, String user_company,
			String user_depart, String user_position, String mail_addr) {
		super();
		this.user_cd = user_cd;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_company = user_company;
		this.user_depart = user_depart;
		this.user_position = user_position;
		this.mail_addr = mail_addr;
	}

	public String getUser_cd() {
		return user_cd;
	}

	public void setUser_cd(String user_cd) {
		this.user_cd = user_cd;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_company() {
		return user_company;
	}

	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}

	public String getUser_depart() {
		return user_depart;
	}

	public void setUser_depart(String user_depart) {
		this.user_depart = user_depart;
	}

	public String getUser_position() {
		return user_position;
	}

	public void setUser_position(String user_position) {
		this.user_position = user_position;
	}

	public String getMail_addr() {
		return mail_addr;
	}

	public void setMail_addr(String mail_addr) {
		this.mail_addr = mail_addr;
	}

	
	@Override
	public String toString() {
		return "MemberVO [user_cd=" + user_cd + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
				+ user_name + ", user_company=" + user_company + ", user_depart=" + user_depart + ", user_position="
				+ user_position + ", mail_addr=" + mail_addr + "]";
	}
	

}
