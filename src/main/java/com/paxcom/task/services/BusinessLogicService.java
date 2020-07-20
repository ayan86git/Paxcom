package com.paxcom.task.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paxcom.task.Helper.Helper;
import com.paxcom.task.model.ServiceRequest;
import com.paxcom.task.model.ServiceResponse;
import com.paxcom.task.validator.Validator;

@Service
public class BusinessLogicService {

	@Autowired
	private Validator validator;
	@Autowired
	private Helper helper;
	@Autowired
	private ServiceResponse response;

	public ServiceResponse processRequest(ServiceRequest request) throws Exception {

		// Validate the request.
		try {
			validator.validate(request);
		} catch (Exception ve) {
			throw new Exception("Invalid request : " + ve.getMessage());
		}

		// Go to the Business logic with validated input
		try {
			response = helper.doBusinessLogic(request);

		} catch (Exception ble) {
			throw new Exception("Exception in business logic : " + ble.getMessage());
		}
		return response;

	}

}
