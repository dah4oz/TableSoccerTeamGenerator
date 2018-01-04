package model;

public class Team {
	
	private int mTeamId;
	private String mPlayerOne;
	private String mPlayerTwo;
	public int getTeamId() {
		return this.mTeamId;
	}
	public void setTeamId(int teamId) {
		this.mTeamId = teamId;
	}
	public String getPlayerOne() {
		return this.mPlayerOne;
	}
	public void setPlayerOne(String playerOne) {
		this.mPlayerOne = playerOne;
	}
	public String getPlayerTwo() {
		return this.mPlayerTwo;
	}
	public void setPlayerTwo(String playerTwo) {
		this.mPlayerTwo = playerTwo;
	}
	@Override
	public String toString() {
		return "Team [mTeamId=" + this.mTeamId + ", mPlayerOne=" + this.mPlayerOne + ", mPlayerTwo=" + this.mPlayerTwo
				+ "]";
	}

}
