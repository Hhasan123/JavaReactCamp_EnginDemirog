import Gamers.Gamers;
import Games.Games;

public class GamersGamer {

	public void myGames(Games[] game,Gamers gamer) {
		gamer.setGames(game);
		System.out.println("----------Ho?geldiniz "+gamer.getFirstName()+" "+gamer.getLastName()+"----------");
		System.out.println("Oyunlar?n?z a?a??dad?r.");
		for (Games games : game) {
			System.out.println(games.getGameName());
		}
		System.out.println();
	}
}
