import generator.TeamGenerator;

public class Main {

	public static void main(String[] args) {
		TeamGenerator teamGenerator = new TeamGenerator();
		teamGenerator.startGenerating();
		teamGenerator.printTeams();
	}

}
