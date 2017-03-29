package com.mycompany.basicmathoperations.oop;

public class AdditionOperatorFor2numbers extends OperatorFor2numbers implements Addition {

	public AdditionOperatorFor2numbers() {
	}
	
	public AdditionOperatorFor2numbers(float _number1, float number2) {
		super(_number1,number2);
		
	}
	
	
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public float add(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public float add2numbers() {
		// TODO Auto-generated method stub
		return number1+number2;
	}

}
