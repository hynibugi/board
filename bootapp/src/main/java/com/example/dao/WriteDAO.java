package com.example.dao;

import java.util.List;

import com.example.board.Board;

public interface WriteDAO {
	// DB에넣기 C
	public int insert(Board b);

	// 전체게시글 list읽기
	public List<Board> getAll();

	// 삭제 Delete
	public int delete(int pk);
	
	// 게시글 한개 읽기 Read
	public Board read(int pk);
	
}
