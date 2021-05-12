package com.snkit.resiliencechaosmonkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResilianceDemoController {
	
	@Autowired
	ResilianceDemoService resilianceDemoService;
	
	@GetMapping(value = "/getCust")
	public String getcustByNames() {
		return resilianceDemoService.getCust();

	}
	
	@GetMapping(value = "/test")
	public ResponseDTO test() {
		return resilianceDemoService.chaosmonkey();

	}
	

}
