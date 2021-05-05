import Gamers.Gamers;
import Games.Games;
import Managers.GamesStoreManager;

public class GameStore {
	
	public void usersGameStore (Games[] games) {
		GamesStoreManager gamesStoreManager =new GamesStoreManager();
		gamesStoreManager.siralaVeEkranaYerlestir(games);
	}
}
