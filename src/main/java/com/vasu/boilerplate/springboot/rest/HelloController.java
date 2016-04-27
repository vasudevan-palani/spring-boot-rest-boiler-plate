package com.vasu.boilerplate.springboot.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


	@RequestMapping(produces = "application/json", value = "/hello", method = { RequestMethod.POST,
			RequestMethod.OPTIONS })
	public ResponseEntity<Response> hello(@RequestBody Request request) {
		Response response = new Response();
		response.setErrorMsg("Hello "+ request.getName()+"!!");
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
    
}