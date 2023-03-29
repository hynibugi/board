package com.example.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.WriteServiceimpl;

@Controller
public class BoardController {

	@Autowired
	private WriteServiceimpl service;

	@GetMapping("/list")
	public String show(Model model) {
		List<Board> d = service.getAll();
		model.addAttribute("list", d);
		return "list";
	}

	@GetMapping("/show")
	public String read(@RequestParam("pk") int pk, Model model) {
		Board b = service.read(pk);
		model.addAttribute("board", b);
		return "show";
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
