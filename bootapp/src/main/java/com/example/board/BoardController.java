package com.example.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	@GetMapping(value = "/delete", params = "pk")
	public String delete(@RequestParam("pk") int pk) {
		service.delete(pk);
		return "delete";
	}

	@GetMapping("/list")
	public String show(Model model) {
		List<Board> d = service.getAll();
		model.addAttribute("list", d);
		return "list";
	}

	@GetMapping(value = "/list", params = "id")
	public String read(@RequestParam("id") int pk, Model model) {
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
		HttpSession session = request.getSession();
		Board b = new Board();
		String title = request.getParameter("title");
		String nickname = request.getParameter("nickname");
		String mytextarea = request.getParameter("my-textarea");
		String importantContentString = request.getParameter("importantcontent");
		boolean importantcontent = Boolean.parseBoolean(importantContentString);
		String lastname = request.getParameter("nickname");
		session.setAttribute("lastname", lastname);

		b.setTitle(title);
		b.setNickname(nickname);
		b.setMy_textarea(mytextarea);
		b.setImportantcontent(importantcontent);
		service.board(b);

		return "redirect:/list";
	}
}
