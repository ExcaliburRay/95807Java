//Write your Andrew-ID and name here
package lab2;

import java.math.BigInteger;

/**Factorial class calculates factorial of a number of potentially unlimited size.
 * It has an overloaded calcFactorial method, one with int and the other 
 * with BigInteger as a parameter. 
 * The main method takes user input as a number and then prints its factorial value  
 */
public class Factorial {
	
	//DO NOT change the method signature
	int calcFactorial(int n) {
		//write your code here
		return 0; //to be replaced with appropriate return statement
	}
	
	//DO NOT change the method signature
	BigInteger calcFactorial(BigInteger n) {
		//write your code here
		return null; //to be replaced with appropriate return statement
	}
	
	public static void main(String[] args) {
		int n = 0;
		Factorial factorial = new Factorial();
		//write the console I/O statements here
		if (n < 13) 
			System.out.printf("Factorial of %d is %,d%n", n, factorial.calcFactorial(n) );
		else 
			System.out.printf("Factorial of %d is %,d%n", n, factorial.calcFactorial(BigInteger.valueOf(n)));
	}
}
