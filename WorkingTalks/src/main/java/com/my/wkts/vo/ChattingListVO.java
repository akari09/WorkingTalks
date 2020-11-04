package com.my.wkts.vo;

public class ChattingListVO {
	
	String user_cd = "";
	String chatroom_cd = "";
	String chatroom_name = "";
	String chatroom_personcnt = "";

	public ChattingListVO() {
		// TODO Auto-generated constructor stub
	}

	public ChattingListVO(String user_cd, String chatroom_cd, String chatroom_name, String chatroom_personcnt) {
		this.user_cd = user_cd;
		this.chatroom_cd = chatroom_cd;
		this.chatroom_name = chatroom_name;
		this.chatroom_personcnt = chatroom_personcnt;
	}

	public String getUser_cd() {
		return user_cd;
	}

	public void setUser_cd(String user_cd) {
		this.user_cd = user_cd;
	}

	public String getChatroom_cd() {
		return chatroom_cd;
	}

	public void setChatroom_cd(String chatroom_cd) {
		this.chatroom_cd = chatroom_cd;
	}

	public String getChatroom_name() {
		return chatroom_name;
	}

	public void setChatroom_name(String chatroom_name) {
		this.chatroom_name = chatroom_name;
	}

	public String getChatroom_personcnt() {
		return chatroom_personcnt;
	}

	public void setChatroom_personcnt(String chatroom_personcnt) {
		this.chatroom_personcnt = chatroom_personcnt;
	}

	@Override
	public String toString() {
		return "ChattingListVO [user_cd=" + user_cd + ", chatroom_cd=" + chatroom_cd + ", chatroom_name="
				+ chatroom_name + ", chatroom_personcnt=" + chatroom_personcnt + "]";
	}
	
	
}
