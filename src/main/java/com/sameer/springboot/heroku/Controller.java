package com.sameer.springboot.heroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String sameer(){
		return "this is sameer, here is my hetoku application";	
	}

}
