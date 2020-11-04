package com.my.wkts.vo;

public class ChattingRoomVO {
	
	String chatroom_cd = "";
	String chatroom_entry = "";
	String chatroom_msgurl = "";
	
	public ChattingRoomVO() {
		// TODO Auto-generated constructor stub
	}

	public ChattingRoomVO(String chatroom_cd, String chatroom_entry, String chatroom_msgurl) {
		this.chatroom_cd = chatroom_cd;
		this.chatroom_entry = chatroom_entry;
		this.chatroom_msgurl = chatroom_msgurl;
	}

	public String getChatroom_cd() {
		return chatroom_cd;
	}

	public void setChatroom_cd(String chatroom_cd) {
		this.chatroom_cd = chatroom_cd;
	}

	public String getChatroom_entry() {
		return chatroom_entry;
	}

	public void setChatroom_entry(String chatroom_entry) {
		this.chatroom_entry = chatroom_entry;
	}

	public String getChatroom_msgurl() {
		return chatroom_msgurl;
	}

	public void setChatroom_msgurl(String chatroom_msgurl) {
		this.chatroom_msgurl = chatroom_msgurl;
	}

	@Override
	public String toString() {
		return "ChattingRoomVO [chatroom_cd=" + chatroom_cd + ", chatroom_entry=" + chatroom_entry
				+ ", chatroom_msgurl=" + chatroom_msgurl + "]";
	}
	
}
