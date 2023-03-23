package com.example.board;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JButton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.WriteServiceimpl;

@Controller
public class BoardController {
	JButton mybtn;
	
	@Autowired
	private WriteServiceimpl service;

	@GetMapping("/show")
	public String show() {

		return "show";
	}

	@GetMapping("/list")
	public String showView(@RequestParam(name = "pk", required = false) String pk) {

		return "list";
	}

	@GetMapping("/write")
	public String write() {
		return "write";
	}

	@PostMapping("/write")
	public String writePost(HttpServletRequest request) {
		Board b = new Board();
		String title = request.getParameter("title");
		String nickname = request.getParameter("nickname");
		String mytextarea = request.getParameter("my-textarea");
		b.setTitle(title);
		b.setNickname(nickname);
		b.setMy_textarea(mytextarea);
		service.board(b);
		return "show";
	}

}
