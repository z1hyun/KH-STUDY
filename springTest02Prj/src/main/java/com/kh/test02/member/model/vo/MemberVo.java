package com.kh.test02.member.model.vo;

public class MemberVo {
	private String id;
	private String pwd;
	private String nick;
	private String enrollDate;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", enrollDate=" + enrollDate + "]";
	}
	
	
	
}
