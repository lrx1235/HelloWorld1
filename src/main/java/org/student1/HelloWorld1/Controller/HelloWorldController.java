package org.student1.HelloWorld1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	//xiu  gai  le
	//我来了hhh
	@ResponseBody
	@RequestMapping("helloWorld")
	public String helloWorld() {
		return "hello word;hello spring boot";
	}
}
