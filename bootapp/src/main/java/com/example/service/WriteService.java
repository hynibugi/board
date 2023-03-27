package com.example.service;

import com.example.board.Board;

public interface WriteService {
// c
	int board(Board b);
	
// r
	Board read(int pk);
	
// d
	int delete(int pk);

}
