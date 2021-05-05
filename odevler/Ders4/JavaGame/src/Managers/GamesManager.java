package Managers;

import Games.Games;

public class GamesManager {
	
	public void gameAdd(Games games) {
		System.out.println("Oyun eklendi : "+games.getGameName());
	}
	public void gameUpdate(Games games) {
		System.out.println("Oyun güncellendi : "+games.getGameName());
	}
	public void gameDelete(Games games) {
		System.out.println("Oyun silindi : "+games.getGameName());
	}
}
