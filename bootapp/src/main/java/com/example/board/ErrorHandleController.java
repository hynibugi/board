package com.example.board;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandleController {
	@ExceptionHandler
	public String errorPage(EmptyResultDataAccessException e, Model m) {
		m.addAttribute("errorMessage", "게시글이 없습니다. 확인해주세요.");
		return "error";
	}
}
