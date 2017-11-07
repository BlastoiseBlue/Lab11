/*
 * Emmet Stanevich
 * 11/7/17
 * Problem 2
 */
package problem2;

public class Driver {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 3);
		Fraction f2 = new Fraction(20, 60);
		System.out.println(f1.getQuotient());
		System.out.println(f2.getQuotient());
		Fraction.compare(f1, f2);
	}

}
