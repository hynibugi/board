package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.board.Board;

@Repository
public class WriteDAOImpl implements WriteDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Board b) {
		String sql = "INSERT INTO board (title, nickname, mytextarea) VALUES (?, ?, ?)";
		 jdbcTemplate.update(sql, b.getTitle(), b.getNickname(), b.getMy_textarea());
		 return 1;
	}

	@Override
	public int view(int pk) {
		String view = "Select * from board where pk= ?";
		return 0;
	}
}
