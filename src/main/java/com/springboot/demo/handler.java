package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class handler {
	
	@RequestMapping("/test")
	public String first() {
		
		return "first boot project!!";
	}

}
