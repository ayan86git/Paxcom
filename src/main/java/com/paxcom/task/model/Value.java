package com.paxcom.task.model;

public class Value {
	
	private double value;
	private int afterRounding;
	private double difference;
	
	public Value() {
		
	}
	public Value(double value, int afterRounding, double difference) {
		
		this.value = value;
		this.afterRounding = afterRounding;
		this.difference = difference;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getAfterRounding() {
		return afterRounding;
	}
	public void setAfterRounding(int afterRounding) {
		this.afterRounding = afterRounding;
	}
	public double getDifference() {
		return difference;
	}
	public void setDifference(double difference) {
		this.difference = difference;
	}
	@Override
	public String toString() {
		return "Value [value=" + value + ", afterRounding=" + afterRounding + ", difference=" + difference + "]";
	}
	
	

}
