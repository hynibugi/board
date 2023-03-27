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

	@GetMapping("/list")
	public String show() {
		//게시글목록 DBㅇㅔ서  읽어서 매핑시켜서 꺼내오기 그걸 view로 나타내기///
		return "list";
	}

	@GetMapping("/show")
	public String showView(@RequestParam(name = "pk", required = false) String pk) {

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
