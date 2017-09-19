/**
 * File Name: fibonacciSequence.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Sep 18, 2017
 */
package com.sqa.jd;

/**
 * fibonacciSequence //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Javier Delgado
 * @version 1.0.0
 * @since 1.0
 */
public class fibonacciSequence {

	public static long fibonacci(int i) {
		if (i == 00)
			return 0;
		if (i <= 2)
			return 1;
		long nTerm = fibonacci(i - 1) + fibonacci(i - 2);
		return nTerm;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nTerm = 0;
		while (true) {
			System.out.println(fibonacci(nTerm));
			nTerm++;
		}
	}
}
