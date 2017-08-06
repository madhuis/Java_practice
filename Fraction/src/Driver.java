/*
 * File: Driver.java
 * 
 * This file used Fraction class and creates fraction objects.
 * 
 * Reference: CS 61B UC Berkley
 * 
 * Modification: Used Fraction.gcd() implementation to use gcd() method [static method] defined in Fraction class.
 * 
 * File Created by Jonathan Shewchuk.
 * 
 * 
 */


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fraction f0 = new Fraction();
	    Fraction f1 = new Fraction(3);
	    Fraction f2 = new Fraction(12, 20);
	    Fraction f3 = new Fraction(f2);

	    System.out.println("\nTesting constructors and toString():");
	    System.out.println("The fraction f0 is " + f0.toString());
	    System.out.println("The fraction f1 is " + f1);    // toString is implicit.
	    System.out.println("The fraction f2 is " + f2);
	    System.out.println("The fraction f3 is " + f3 + ", which should equal f2");

	    /* Test the add method. */
	    System.out.println("\nTesting add:");

	    
	    Fraction sumOfTwo = f1.add(f2);              // Sum of f1 and f2.
	    Fraction sumOfThree = f0.add(sumOfTwo);             // Sum of f0, f1, and f2.

	    System.out.println("The sum of " + f1 + " and " + f2 + " is " + sumOfTwo);
	    System.out.println("The sum of " + f0 + ", " + f1 + " and " + f2 + " is " +
	                       sumOfThree);
	    

	    /* Test the methods used in Part III. */
	    System.out.println("\nTesting changeNumerator and fracs:");

	    f3.changeNumerator(7);
	    System.out.println("Now f3 is " + f3 + ", which should be 7/20");
	    System.out.println("The total number of Fraction objects is " +
	                       f3.fracs());

	    /* Test gcd function (static method). */
	    System.out.println("\nTesting gcd:");
	    System.out.println("The gcd of 2 and 10 is: " + Fraction.gcd(2, 10));
	    System.out.println("The gcd of 15 and 5 is: " + Fraction.gcd(15, 5));
	    System.out.println("The gcd of 24 and 18 is: " + Fraction.gcd(24, 18));
	    System.out.println("The gcd of 10 and 10 is: " + Fraction.gcd(10, 10));
	    System.out.println("The gcd of 21 and 400 is: " + Fraction.gcd(21, 400));

		
	}

}
