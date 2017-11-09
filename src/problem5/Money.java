package problem5;

import java.text.NumberFormat;

public class Money {
	int dollars = 0;
	int cents = 0;

	double value() {
		return dollars + cents * 0.01;
	}

	NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

	public String toString() {
		return moneyFormatter.format(value());
	}

	public void output() {
		System.out.println(toString());
	}

	public void add(Money m) {
		dollars = dollars + m.dollars;
		cents = cents + m.cents;
	}

	public void add(int d, int c) {
		dollars = dollars + d;
		cents = cents + c;
	}

	public static Money add(Money m1, Money m2) {
		Money m3 = new Money(m1.dollars + m2.dollars, m1.cents + m2.cents);
		return m3;
	}

	public void minus(Money m) {
		dollars = dollars - m.dollars;
		cents = cents - m.cents;
	}

	public void minus(int d, int c) {
		dollars = dollars - d;
		cents = cents - d;
	}

	public static Money minus(Money m1, Money m2) {
		Money m3 = new Money(m1.dollars - m2.dollars, m1.cents - m2.cents);
		return m3;
	}

	public Money(Money m1, Money m2) {
		dollars = m1.dollars + m2.dollars;
		cents = m1.cents + m2.cents;
	}

	public Money(int inputDollars, int inputCents) {
		dollars = inputDollars;
		cents = inputCents;
	}

	public Money(int inputDollars) {
		dollars = inputDollars;
		cents = 0;
	}

	public Money(Money m) {
		dollars = m.dollars;
		cents = m.cents;
	}
}
