import Gamers.Gamers;
import Games.Games;
import Games.RacingGames;
import Games.StrategyGames;
import Games.TableGames;
import Games.WarGames;
import Managers.GamerManager;
import Managers.GamersCheckUp;
import Managers.GamesManager;
import Managers.GamesStoreManager;

public class Main {

	public static void main(String[] args) {
		
		
		GamerManager gamerManager=new GamerManager() {};
		Gamers gamer=new Gamers();
		gamer.setFirstName("Hasan");
		gamer.setLastName("Yýldýz");
		gamer.setGamersId(1);
		
		GamersCheckUp gamersCheckUp=new GamersCheckUp();
		gamersCheckUp.gamerCheck(gamer);
		
		gamerManager.Update(gamer);
		gamerManager.Delete(gamer);
		gamerManager.Add(gamer);
		
		GamesManager gamesManager=new GamesManager();
		Games addGame1=new Games();
		addGame1.setGameName("Call of Duty");
		
		gamesManager.gameAdd(addGame1);
		gamesManager.gameUpdate(addGame1);
		gamesManager.gameDelete(addGame1);
		
		GamesStoreManager gamesStoreManager=new GamesStoreManager();
		RacingGames game1= new RacingGames();
		game1.setGameName("Asphalt 8");
		game1.setPrice(120);
		game1.setDiscountRatio(18);
		game1.setCampaignId(1);
		game1.setCampaignText("Bu yarýþ oyunu bugün yarý fiyatýna");
		
		StrategyGames game2= new StrategyGames();
		game2.setGameName("Simcity Buildit");
		game2.setPrice(60);
		game2.setDiscountRatio(12);
		game2.setCampaignId(2);
		game2.setCampaignText("Bu strateji oyunu yarýn iki katý olacak");
		
		WarGames game3=new WarGames();
		game3.setGameName("Çöp Adam Savaþlarý: Gemiþin Mirasý");
		game3.setPrice(140);
		game3.setDiscountRatio(15);
		game3.setCampaignId(3);
		game3.setCampaignText("Yarým saat sonra fiyatlara GÜNCELLEME yapýlacaktýr.");
		
		Games[] games= {game1,game2,game3};
		
		
		
		
		Games myGame1=new Games();
		myGame1.setGameName("Special Forces Group");
		Games myGame2 =new Games();
		myGame2.setGameName("Hotel Story");
		Games[] myGames = {myGame1,myGame2};
		
		GamersGamer gamersGamer=new GamersGamer();
		gamersGamer.myGames(myGames, gamer);
		gamesStoreManager.siralaVeEkranaYerlestir(games);
	}

}
