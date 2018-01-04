package model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AllPlayers {
	
	private List<String> mAllPlayers = new LinkedList<>();
	
	public AllPlayers() {
		initPlayers();
	}

	private void initPlayers() {
		mAllPlayers.add("Gwendolyn");
		mAllPlayers.add("Lizzie");
		mAllPlayers.add("Jean");
		mAllPlayers.add("Tawanda");
		mAllPlayers.add("Marcus");
		mAllPlayers.add("Cruz");
		mAllPlayers.add("Pelayo");
		mAllPlayers.add("Tran");
		mAllPlayers.add("Stanberry");
		mAllPlayers.add("Keesler");
		mAllPlayers.add("Waylon");
		mAllPlayers.add("Dalton");
		mAllPlayers.add("Justine");
		mAllPlayers.add("Henderson");
		mAllPlayers.add("Thalia");
		mAllPlayers.add("Cobb");
		mAllPlayers.add("Angela");
		mAllPlayers.add("Walker");
		mAllPlayers.add("Joanna");
		mAllPlayers.add("Shaffer");
		mAllPlayers.add("Jonathon");
		mAllPlayers.add("Sheppard");
		mAllPlayers.add("Lia");
		mAllPlayers.add("Shelton");
		mAllPlayers.add("Hadassah");
		mAllPlayers.add("Hartman");
		
		System.out.println("Player initialized!!!");
	}
	
	public String getNextPlayer(int index) {
		Collections.shuffle(mAllPlayers);
		String player = mAllPlayers.remove(index);
		return player;
	}
	
	public int getRemainingPlayersSize() {
		return mAllPlayers.size();
	}

}
