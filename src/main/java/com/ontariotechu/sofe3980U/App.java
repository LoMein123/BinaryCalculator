package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		// print the current local time
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime + "\n");

		// create two binary numbers
		Binary binary1 = new Binary("00010001000");
		Binary binary2 = new Binary("111000");
        System.out.println("First binary number is " + binary1.getValue());
        System.out.println("Second binary number is " + binary2.getValue() + "\n");

		// add the two binary numbers
		Binary sum = Binary.add(binary1, binary2);
		System.out.println("Their summation is " + sum.getValue() + "\n");

		// perform the OR operation
		Binary or = Binary.or(binary1, binary2);
		System.out.println("Their OR operation is " + or.getValue() + "\n");

		// perform the AND operation
		Binary and = Binary.and(binary1, binary2);
		System.out.println("Their AND operation is " + and.getValue() + "\n");

		// Multiply the two binary numbers
		Binary product = Binary.multiply(binary1, binary2);
		System.out.println("Their product is " + product.getValue());
    }
}
