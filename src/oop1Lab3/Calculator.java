package oop1Lab3;

public class Calculator {
	
	double num1;
	double num2;
	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double calculateAdd() {
		return num1+num2;
	}
	public double calculateSub() {
		return num1-num2;
	}
	public double calculateMul() {
		return num1*num2;
	}
	public double calculateDiv() {
		return num1/num2;
	}
	
	

}
