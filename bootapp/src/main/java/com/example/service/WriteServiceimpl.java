package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.board.Board;
import com.example.dao.WriteDAO;

public class WriteServiceimpl implements WriteService{
	
	@Autowired
	WriteDAO wr;

	@Override
	public int board(Board b) {
		return wr.insert(b);
	}
}
