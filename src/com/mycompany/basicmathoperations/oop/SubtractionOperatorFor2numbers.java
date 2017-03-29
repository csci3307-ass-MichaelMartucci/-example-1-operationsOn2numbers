package com.mycompany.basicmathoperations.oop;

public class SubtractionOperatorFor2numbers extends OperatorFor2numbers implements Subtraction {

	public SubtractionOperatorFor2numbers() {
	}
	
	public SubtractionOperatorFor2numbers(float _number1, float number2) {
		super(_number1,number2);
		
	}
	

	
	
	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public float sub(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public float sub2numbers() {
		// TODO Auto-generated method stub
		return number1-number2;
	}

}
