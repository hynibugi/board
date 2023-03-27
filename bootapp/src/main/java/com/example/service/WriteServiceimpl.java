package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.Board;
import com.example.dao.WriteDAO;
@Service
public class WriteServiceimpl implements WriteService {

	@Autowired
	WriteDAO wr;
	
	//c
	@Override
	public int board(Board b) {
		return wr.insert(b);
	}
	
	//r
	@Override
	public Board read(int pk) {
		return wr.read(pk);
	}
	
	//d
	@Override
	public int delete(int pk) {
		return wr.delete(pk);
	}


}
