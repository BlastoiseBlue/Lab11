package problem4;

public class Competition {
	private int year;
	private String compName;
	private Team winningTeam, runnerUp;

	public void compInfo() {
		System.out.println("Results for " + compName + ":");
		System.out.println("Year: " + year);
		System.out.println("Winner: " + winningTeam.getTeamName());
		System.out.println("Runner up: " + runnerUp.getTeamName());
	}

	public Competition(int inputYear, String inputName, Team inputWinningTeam, Team inputRunnerUp) {
		year = inputYear;
		compName = inputName;
		winningTeam = new Team(inputWinningTeam);
		runnerUp = new Team(inputRunnerUp);
	}

	public Competition(Competition comp1) {
		year = comp1.year;
		compName = comp1.compName;
		winningTeam = new Team(comp1.winningTeam);
		runnerUp = new Team(comp1.runnerUp);
	}
}
