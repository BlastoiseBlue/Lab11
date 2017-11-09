package problem4;

public class Driver {

	public static void main(String[] args) {
		Team blueBombers = new Team("Blue Bombers", "Emmet", "Jake", "Dan", "Bob");
		Team redRockets = new Team("Red Rockets", "Jonah", "Donny", "Jackson", "Steve");
		Competition comp1 = new Competition(2002, "First Competition", blueBombers, redRockets);
		Competition comp2 = new Competition(2006, "Second Competition", redRockets, blueBombers);
		blueBombers.Compete(comp1, comp2);
		redRockets.Compete(comp1, comp2);
		blueBombers.getInfo();
		redRockets.getInfo();
	}

}
