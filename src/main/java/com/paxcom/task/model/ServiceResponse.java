package com.paxcom.task.model;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class ServiceResponse {
	
	private Value[] roundedDown;
	private Value[] roundedUp;
	private double remainingFund;
	private double[] notRoundedValues;
	public ServiceResponse() {
		
	}
	public ServiceResponse(Value[] roundedDown, Value[] roundedUp, double remainingFund, double[] notRoundedValues) {
		this.roundedDown = roundedDown;
		this.roundedUp = roundedUp;
		this.remainingFund = remainingFund;
		this.notRoundedValues = notRoundedValues;
	}
	public Value[] getRoundedDown() {
		return roundedDown;
	}
	public void setRoundedDown(Value[] roundedDown) {
		this.roundedDown = roundedDown;
	}
	public Value[] getRoundedUp() {
		return roundedUp;
	}
	public void setRoundedUp(Value[] roundedUp) {
		this.roundedUp = roundedUp;
	}
	public double getRemainingFund() {
		return remainingFund;
	}
	public void setRemainingFund(double remainingFund) {
		this.remainingFund = remainingFund;
	}
	public double[] getNotRoundedValues() {
		return notRoundedValues;
	}
	public void setNotRoundedValues(double[] notRoundedValues) {
		this.notRoundedValues = notRoundedValues;
	}
	@Override
	public String toString() {
		return "ServiceResponse [" + (roundedDown != null ? "roundedDown=" + Arrays.toString(roundedDown) + ", " : "")
				+ (roundedUp != null ? "roundedUp=" + Arrays.toString(roundedUp) + ", " : "") + "remainingFund="
				+ remainingFund + ", "
				+ (notRoundedValues != null ? "notRoundedValues=" + Arrays.toString(notRoundedValues) : "") + "]";
	}
	
	

}
