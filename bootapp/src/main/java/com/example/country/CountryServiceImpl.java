package com.example.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryDAO repository;
	
	@Override
	public List<Country> getAll() {
		return repository.getAll();
	}
}
