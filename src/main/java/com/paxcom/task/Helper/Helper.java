package com.paxcom.task.Helper;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.paxcom.task.model.ServiceRequest;
import com.paxcom.task.model.ServiceResponse;
import com.paxcom.task.model.Value;

@Component
public class Helper {
	
	private static DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * @param request
	 * @return response
	 * This method performs the actual business logic to generate the response.
	 * @throws Exception 
	 */
	public ServiceResponse doBusinessLogic(ServiceRequest request) throws Exception {
		ServiceResponse response = null;
		List<Value> roundUpList = new ArrayList<Value>();
		List<Value> roundDownList = new ArrayList<Value>();
		List<Double> notRoundedList = new ArrayList<Double>();
		double remainingFund = request.getInitialFund();
		
		try {
			// Loop through all values and populate respective lists
			for(double val : request.getValues()) {
				
				Value value = new Value();
				value.setValue(val);
				value.setAfterRounding((int) Math.round(val));
				double difference = Double.parseDouble(df.format(Math.round(val) - val));
				value.setDifference(Math.abs(difference));
				remainingFund -= difference;
				
				if(remainingFund >= 0) {
					if(difference >= 0) {
						roundUpList.add(value);
					} else {
						roundDownList.add(value);
					}
				} else {
					notRoundedList.add(new Double(val));
				}
			}
			
			double[] notRoundedArr = new double[notRoundedList.size()];
			 for (int i = 0; i < notRoundedArr.length; i++) {
				 notRoundedArr[i] = notRoundedList.get(i).doubleValue();  
			     notRoundedArr[i] = notRoundedList.get(i);               
			 }
			 
			 Value[] roundDownArr = new Value[roundDownList.size()];
			 Value[] roundUpArr = new Value[roundUpList.size()];
			
			// Populate Response object
			response = new ServiceResponse();
			response.setNotRoundedValues(notRoundedArr);
			response.setRemainingFund(Double.parseDouble(df.format(remainingFund)));
			response.setRoundedDown(roundDownList.toArray(roundDownArr));
			response.setRoundedUp(roundUpList.toArray(roundUpArr));
			
		} catch (Exception e) {
			throw new Exception("Exception during business logic " + e.getMessage());
		}
		
		return response;
	}

}
