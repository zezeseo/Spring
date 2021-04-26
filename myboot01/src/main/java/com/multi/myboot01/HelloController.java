package com.multi.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	@ResponseBody //결과를 view 페이지를 통하지 않도
	@RequestMapping("/")
	public String home() {
		System.out.println("Hello Boot~");
		return "Hello boot~";
	}
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msssage","안녕하세요");
		return "hello";
	}
}
