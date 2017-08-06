/*
 * File: Fraction.java
 * 
 * This file describes Fraction class which has constructors, GCD
 * and use of recursion method.
 * 
 * Reference: CS 61B UC Berkley
 * 
 * File Created by Jonathan Shewchuk.
 */


public class Fraction {
	
	  /* private fields within a Fraction. */
	  private int numberOfFractions = 0;

	  private int numerator;
	  private int denominator;

	  /** Constructs a Fraction n/d. 
	   *  @param n is the numerator.  Must be nonnegative.
	   *  @param d is the denominator.  Must be positive.
	   */
	  public Fraction(int n, int d) {
	    if (n < 0) {
	      System.out.println("Fatal error:  Negative numerator.");
	      System.exit(0);
	    }
	    if (d < 1) {
	      System.out.println("Fatal error:  Nonpositive denominator.");
	      System.exit(0);
	    }
	    numberOfFractions++;
	    numerator = n; 
	    denominator = d;
	  }

	  /** Constructs a Fraction n/1. 
	   *  @param n is the numerator.  Must be nonnegative.
	   */
	  public Fraction(int n) {
	    this(n, 1);
	  }

	  /** Constructs a Fraction 0/1. 
	   */
	  public Fraction() {
		  this(0,1); // Change made. 
		  /*
		   * The same constructor but arguments are different.
		   */
	  }

	  /** Copies the Fraction "original".
	   */
	  public Fraction(Fraction original){
	    this.numberOfFractions++;
	    numerator = original.numerator;
	    denominator = original.denominator;
	  }

	  /** Converts this Fraction to a string format:  "numerator/denominator."
	   *  Fractions should be printed in reduced form (part of your assignment is
	   *  to make this true).
	   *  @return a String representation of this Fraction.
	   */
	  public String toString() {
	    int thisGcd = gcd(numerator, denominator);

	    return (numerator / thisGcd + "/" + denominator / thisGcd);
	  }

	  /** Return the sum of two fractions.
	   *  @param f2 is the Fraction to be added.
	   *  @return the result of adding f2 to this Fraction.
	   */
	  public Fraction add(Fraction f2) {
	    Fraction r = new Fraction((numerator * f2.denominator) +
				      (f2.numerator * denominator),
				      denominator * f2.denominator);
	    return r;
	  }

	  /** Replaces this Fraction's numerator with a new value.
	   *  @param numerator is the new numerator.  Must be nonnegative.
	   */
	  public void changeNumerator(int numerator) { // DO NOT CHANGE THIS SIGNATURE!
	    // Fix the bug that prevents this method from working correctly.
	    if (numerator < 0) {
	      System.out.println("Fatal error:  Negative numerator.");
	      System.exit(0);
	    }
	    this.numerator = numerator;
	  }

	  /** Returns the number of Fraction objects in existence.
	   *  @return the number of Fraction objects in existence.
	   */
	  public int fracs() {                         // DO NOT CHANGE THIS SIGNATURE!
	    // Fix the bug that prevents this method from working correctly.
	    return numberOfFractions;
	  }
	  
	  /** Computes the greatest common divisor (gcd) of the two inputs.
	   * @param x must be nonnegative
	   * @param y must be nonnegative
	   * @return the gcd of x and y
	   */
	  public static int gcd(int x, int y) {
	    /* Replace the following line with your solution. */
	    if(y == 0){
	      return x;
	    }else{
	      return gcd(y, x % y);
	    }
	  }
		  
	  

}
