package problem5;

public class Driver {

	public static void main(String[] args) {
		Money money1 = new Money(12, 48);
		Money money2 = new Money(10, 70);
		money1.output();
		Money.add(money1, money2).output();
	}

}
