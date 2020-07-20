package com.paxcom.task.validator;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.paxcom.task.model.ServiceRequest;

@Component
public class Validator {
	
	/**
	 * @param request
	 * This method is for validating the input for the service.
	 * @throws Exception 
	 */
	public void validate(ServiceRequest request) throws Exception {
		if(Arrays.stream(request.getValues()).anyMatch(x -> x < 0)) {
			throw new Exception("Invalid data present in values");
		}
		if(request.getInitialFund() <= 0) {
			throw new Exception("Invalid Initial Fund");
		}
	}
	
	

}
