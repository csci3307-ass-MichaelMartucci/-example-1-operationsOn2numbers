/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

import java.util.Scanner;
import com.mycompany.basicmathoperations.oop.Multiply;
import com.mycompany.basicmathoperations.oop.Divide;

/**
 * @author ilker
 *
 */
public class MainEntry4oop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4oop with args:" + args);
		
		// get inputs
		
		Scanner scanner = new Scanner(System.in);
		float number1, number2;
		float result;
		float result2;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1 for multiplication");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2 for multiplication");
		number2 = scanner.nextFloat();
		
		// Multiply blo
		
		Multiply multiplier = new MultiplyOperatorFor2numbers(number1, number2);
		result = multiplier.multiply(number1, number2);
		System.out.printf("result:",result);
		result = multiplier.multiply2numbers();
		System.out.printf("result of multiply2numbers() is %.2f%n", result);		
		//print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		
		
		//Divide Block
		Divide divider= new DivideOperatorFor2numbers();
		result=divider.divide(number1,number2);
		System.out.printf("result:")
		System.out.println(result);
		scanner.close();
		}

	}


