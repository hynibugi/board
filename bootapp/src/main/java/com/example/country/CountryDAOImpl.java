package com.example.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDAOImpl implements CountryDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Country> getAll() {
		return jdbcTemplate.query("SELECT * FROM country", new BeanPropertyRowMapper<Country>(Country.class));
	}
}
