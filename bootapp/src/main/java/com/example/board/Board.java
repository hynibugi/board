package com.example.board;

public class Board {
	String title;
	String nickname;
	String my_textarea;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMy_textarea() {
		return my_textarea;
	}

	public void setMy_textarea(String my_textarea) {
		this.my_textarea = my_textarea;
	}

	public Board(String title, String nickname, String my_textarea) {
		super();
		this.title = title;
		this.nickname = nickname;
		this.my_textarea = my_textarea;
	}

	public Board() {
	}

}
