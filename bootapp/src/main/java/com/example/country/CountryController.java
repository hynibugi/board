package com.example.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/country")
public class CountryController {
	@Autowired
	private CountryService service;

	@GetMapping
	public void countryList(Model model) {
		model.addAttribute("countryList", service.getAll());
	}
}
