package com.paxcom.task.model;

import java.util.Arrays;

public class ServiceRequest {
	
	private double[] values;
	private double initialFund;
	
	public ServiceRequest() {
		
	}
	
	public ServiceRequest(double[] values, double initialFund) {
		super();
		this.values = values;
		this.initialFund = initialFund;
	}
	
	public double[] getValues() {
		return values;
	}
	public void setValues(double[] values) {
		this.values = values;
	}
	
	public double getInitialFund() {
		return initialFund;
	}
	public void setInitialFund(double initialFund) {
		this.initialFund = initialFund;
	}
	
	@Override
	public String toString() {
		return "ServiceRequest [" + (values != null ? "values=" + Arrays.toString(values) + ", " : "") + "initialFund="
				+ initialFund + "]";
	}
	
}
