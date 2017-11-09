package problem4;

public class Team {
	String teamName;
	String[] name = new String[4];
	Competition competition1, competition2;

	public void setTeamName(String inputTeamName) {
		if (teamName == null && inputTeamName != null)
			teamName = inputTeamName;
	}

	public void setNames(String inputName1, String inputName2, String inputName3, String inputName4) {
		if (name[0] == null && name[1] == null && name[2] == null && name[3] == null && inputName1 != null
				&& inputName2 != null && inputName3 != null && inputName4 != null) {
			name[0] = inputName1;
			name[1] = inputName2;
			name[2] = inputName3;
			name[3] = inputName4;
		}
	}

	public void getInfo() {
		System.out.println("Team Name: " + teamName);
		System.out.println("Members: " + name[0] + ", " + name[1] + ", " + name[2] + " and " + name[3]);
		competition1.compInfo();
		competition2.compInfo();
	}

	public Team() {
		teamName = null;
		name[0] = null;
		name[1] = null;
		name[2] = null;
		name[3] = null;
	}

	public Team(String inputTeamName) {
		teamName = inputTeamName;
		name[0] = null;
		name[1] = null;
		name[2] = null;
		name[3] = null;
	}

	public Team(String inputTeamName, String inputName1, String inputName2, String inputName3, String inputName4) {
		teamName = inputTeamName;
		name[0] = inputName1;
		name[1] = inputName2;
		name[2] = inputName3;
		name[3] = inputName4;
	}

	public Team(Team t1) {
		teamName = t1.teamName;
		name = t1.name;
	}
}
