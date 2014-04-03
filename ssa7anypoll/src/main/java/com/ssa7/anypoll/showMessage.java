package com.ssa7.anypoll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class showMessage {
	
	@RequestMapping("/showMessage")
	public String showMessage(){
		return "showMessage";
	}

}
