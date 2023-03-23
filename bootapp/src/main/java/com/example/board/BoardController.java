package com.example.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
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
		String title = request.getParameter("title");
		String nickname = request.getParameter("nickname");
		String mytextarea = request.getParameter("my-textarea");
		
		
	}

}
