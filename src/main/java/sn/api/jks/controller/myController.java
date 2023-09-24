package sn.api.jks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Running... !!!";
	}

}
