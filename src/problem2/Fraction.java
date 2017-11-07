package problem2;

public class Fraction {
	private int num = 1;
	private int denom = 1;
	private double quotient = ((double) num) / ((double) denom);

	public void setNum(int inputNum) {
		num = inputNum;
		calibrate();
	}

	public void setDenom(int inputDenom) {
		if (inputDenom != 0) {
			denom = inputDenom;
			calibrate();
		}
	}

	void calibrate() {
		quotient = ((double) num) / ((double) denom);
	}

	public String getQuotient() {
		return num + "/" + denom;
	}

	public void displayQuotient() {
		System.out.println(getQuotient());
	}

	public static void compare(Fraction f1, Fraction f2) {
		if (equals(f1, f2))
			System.out.println(f1.getQuotient() + " and " + f2.getQuotient() + " are equal");
		else
			System.out.println(f1.getQuotient() + " and " + f2.getQuotient() + " are not equal");
	}

	public static boolean equals(Fraction f1, Fraction f2) {
		if (f1.quotient == f2.quotient)
			return true;
		else
			return false;
	}

	Fraction(int inputNum, int inputDenom) {
		setNum(inputNum);
		setDenom(inputDenom);
	}
}
