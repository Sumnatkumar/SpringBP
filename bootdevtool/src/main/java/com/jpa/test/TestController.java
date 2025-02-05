package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
	
	
	@RequestMapping("/this")
	@ResponseBody
	public String test() {
		int a = 31;
		int b = 89;
		int c = 80;
		int d = 100;
		return "this is just testing sum of a and b " + (a + b + c + d);
	}
}
