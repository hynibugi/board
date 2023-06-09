package com.example.board;

public class Board {
	String title;
	String nickname;
	String my_textarea;
	int pk;
	boolean importantcontent;

	public Board(String title, String nickname, String my_textarea, int pk, boolean importantcontent) {
		super();
		this.title = title;
		this.nickname = nickname;
		this.my_textarea = my_textarea;
		this.pk = pk;
		this.importantcontent = importantcontent;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", nickname=" + nickname + ", my_textarea=" + my_textarea + ", pk=" + pk
				+ ", importantcontent=" + importantcontent + "]";
	}

	public boolean isImportantcontent() {
		return importantcontent;
	}

	public void setImportantcontent(boolean importantcontent) {
		this.importantcontent = importantcontent;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

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

	public Board() {
	}

}
