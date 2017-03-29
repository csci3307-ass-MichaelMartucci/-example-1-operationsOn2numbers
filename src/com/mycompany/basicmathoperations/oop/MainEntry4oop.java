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
		float resultm;
		float resultd;
		float resulta;
		float results;
		
		// Multiply block
		System.out.println("Enter number 1 for multiplication: ");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2 for multiplication: ");
		number2 = scanner.nextFloat();
		Multiply multiplier = new MultiplyOperatorFor2numbers(number1, number2);
		resultm = multiplier.multiply2numbers();
		System.out.printf("result:%.2f\n", resultm);	
		
	
		
		//Divide Block
		System.out.println("Enter number 1 for Division: ");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2 for Division: ");
		number2 = scanner.nextFloat();
		Divide divider= new DivideOperatorFor2numbers(number1,number2);
		resultd=divider.divide(number1,number2);
		System.out.printf("result:%.2f\n",resultd);
		
		
		//Additon Block
		System.out.println("Enter number 1 for Addition: ");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2 for Addition: ");
		number2 = scanner.nextFloat();
		Addition adder=new AdditionOperatorFor2numbers(number1,number2);
		resulta=adder.add(number1,number2);
		System.out.printf("result:%.2f\n",resulta);
		
		
		//subtract block
		System.out.println("Enter number 1 for Subtraction: ");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2 for Subtraction: ");
		number2 = scanner.nextFloat();
		Subtraction sub=new SubtractionOperatorFor2numbers(number1,number2);
		results=sub.sub(number1,number2);
		System.out.printf("result:%.2f\n",results);
		
		}

	}
	
	
	
	


