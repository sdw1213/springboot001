package com.spring.sdw.demo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
     
	@ResponseBody
	@RequestMapping(value="/hello")
	public String getMsg(){
		return "hello";
	}
}
