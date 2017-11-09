package problem4;

public class Competition {
	int year;
	String compName, winningTeam, runnerUp;

	public void compInfo() {
		System.out.println("Results for " + compName + ":");
		System.out.println("Year: " + year);
		System.out.println("Winner: " + winningTeam);
		System.out.println("Runner up: " + runnerUp);
	}

	Competition(int inputYear, String inputName, Team inputWinningTeam, Team inputRunnerUp) {
		year = inputYear;
		compName = inputName;
		winningTeam = inputWinningTeam.teamName;
		runnerUp = inputRunnerUp.teamName;
	}
}
