package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import model.AllPlayers;
import model.Team;

public class TeamGenerator {

	private List<Team> mTeamList = new ArrayList<>();
	private AllPlayers mAllPlayers;
	
	public TeamGenerator() {
		mAllPlayers = new AllPlayers();
	}
	
	public void startGenerating() {
		System.out.println("Total Players: " + mAllPlayers.getRemainingPlayersSize());
		while(mAllPlayers.getRemainingPlayersSize() > 1) {
			mTeamList.add(pairNextTeam());
		}
	}
	
	public void printTeams() {
		for(Team team : mTeamList) {
			System.out.println("***********************************************");
			System.out.println(team.toString());
			System.out.println("***********************************************");
		}
	}
	
	private Team pairNextTeam() {
		Team team = new Team();
		String playerOne = getPlayer();
		System.out.print(playerOne);
		String playerTwo = getPlayer();
		System.out.print(" will play with " + playerTwo);
		System.out.println("");
		System.out.println("******************************************");
		team.setTeamId(mTeamList.size() + 1);
		team.setPlayerOne(playerOne);
		team.setPlayerTwo(playerTwo);
		return team;
	}
	
	private String getPlayer() {
		String player = "";
		try {
			Thread.sleep(3 * 1000);
			Random rand = new Random();
			int nextIndex = rand.nextInt(mAllPlayers.getRemainingPlayersSize());
			player = mAllPlayers.getNextPlayer(nextIndex);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return player;
	}
}
