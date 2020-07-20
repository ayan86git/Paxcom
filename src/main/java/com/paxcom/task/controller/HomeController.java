package com.paxcom.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paxcom.task.model.ServiceRequest;
import com.paxcom.task.services.BusinessLogicService;

@RestController
public class HomeController {
	
	
	@Autowired
	private BusinessLogicService service;

	@GetMapping(path = "/home")
	public ResponseEntity<?> home(@RequestBody ServiceRequest request) {
		
		try {
			return ResponseEntity.ok(service.processRequest(request));
		} catch (Exception e) {
			return ResponseEntity.ok("Exception occured : " + e.getMessage());
		}
	}

}
