/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author ilker
 *
 */
public class MultiplyOperatorFor2numbers extends OperatorFor2numbers implements Multiply {


	
	public MultiplyOperatorFor2numbers() {
	}
	
	public MultiplyOperatorFor2numbers(float _number1, float number2) {
		super(_number1,number2);
		
	}


	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}

	@Override
	public float multiply2numbers() {
		return number1 * number2;
	}

}
