package com.example.service;

import java.util.List;

import com.example.board.Board;

public interface WriteService {
// c
	int board(Board b);
	
// r
	Board read(int pk);
	
	List<Board> getAll();
	
// d
	int delete(int pk);
}
