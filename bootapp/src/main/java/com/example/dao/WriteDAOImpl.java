package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.MissingServletRequestParameterException;

import com.example.board.Board;

@Repository
public class WriteDAOImpl implements WriteDAO, RowMapper<Board> {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// c
	@Override
	public int insert(Board b) {
		String sql = "INSERT INTO board (title, nickname, content) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, b.getTitle(), b.getNickname(), b.getMy_textarea());
	}

	@Override
	public Board read(int pk) {
		String sql = "SELECT * FROM board WHERE pk = ?";
		return jdbcTemplate.queryForObject(sql, this, pk);
	}

	// read(all)
	@Override
	public List<Board> getAll() {
		String sql = "SELECT * FROM board";
		return jdbcTemplate.query(sql, this);
	}

	// delete
	@Override
	public int delete(int pk) {
		String sql = "DELETE FROM board WHERE pk = ?";
		return jdbcTemplate.update(sql, pk);
	}

	@Override
	public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
		Board b = new Board();
		String title = rs.getString("title");
		b.setTitle(title);
		String nickname = rs.getString("nickname");
		b.setNickname(nickname);
		String mytextarea = rs.getString("content");
		b.setMy_textarea(mytextarea);
		return b;
	}

}
