
package com.mycompany.basicmathoperations.simple;


import java.util.Scanner;

/**
 * @author ilker
 *
 */
public class MainEntry4simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float number1, number2;
		float resultm,resultd,resulta,results;
		
		// Multiply block
		System.out.println("Enter number 1 for multiplication: ");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2 for multiplication: ");
		number2 = scanner.nextInt();
		Multiply multiplier = new Multiply();
		resultm = multiplier.multiply(number1, number2);
		System.out.printf("result is %.2f%n", resultm);
		
		//Divide block
		System.out.println("Enter number 1 for Division: ");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2 for Division: ");
		number2 = scanner.nextInt();
		Divide div=new Divide();
		resultd = div.div(number1, number2);
		System.out.printf("result is %.2f%n", resultd);
		
		//Add block
		System.out.println("Enter number 1 for Addition: ");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2 for Addition: ");
		number2 = scanner.nextInt();
		Add a=new Add();
		resulta = a.add(number1, number2);
		System.out.printf("result is %.2f%n", resulta);
		
		//sub block
		System.out.println("Enter number 1 for Subtraction: ");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2 for Subtraction: ");
		number2 = scanner.nextInt();
		Sub s=new Sub();
		results = s.sub(number1, number2);
		System.out.printf("result is %.2f%n", results);
		scanner.close();
		
		

	}

}
