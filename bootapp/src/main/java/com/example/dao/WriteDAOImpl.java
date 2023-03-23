package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WriteDAOImpl implements WriteDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int insert(String title, String nickname, String mytextarea) {
		String sql = "INSERT INTO board (title, nickname, mytextarea) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, title, nickname, mytextarea);
	}
}
