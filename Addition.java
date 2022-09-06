/**
 * 
 */
package com.Bridgelabz;

/**
 * @author Dell
 *
 */
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Q1) Create a Java program where we are adding first
		2 integers(22,45) 
		with two float numbers(12.23,45.22).
		After this increment the result with Int 2, 
		check the result is greater than or less than 100.*/
	
	int a=22, b=45;
	float c=(float) 12.23, d=(float)45.22;
	float result=a+b+c+d;
	result=result+2;
	
	if(result<100) {
	System.out.println(result+" is less than 100");
	}
	else if(result==100) {
		System.out.println(result+" is equal to 100");
	}
	else {
		System.out.println(result+" is greater than 100");
	}
	
	}

}
