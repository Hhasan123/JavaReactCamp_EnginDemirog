package Managers;

import Games.Games;

public class GamesStoreManager  extends GamesManager{
	double enBuyuk=0;
		public void siralaVeEkranaYerlestir(Games[] games) {
		System.out.println("----------Size uygun oyunlarýmýz aþaðýdadýr----------");
		System.out.println();

		for (Games game : games) {
			System.out.println(game.getGameName()+" : "+game.getPrice()+"TL deðil sýnýrlý bir süre için yalnýzca ==> "
					+ game.getPriceAfterDiscount() +"TL  %"+game.getDiscountRatio()+" kadar indirimle");
			
			System.out.println("---------- Size uygun kampanyalarýmýz aþaðýdadýr----------");
			System.out.println(game.getCampaignId()+" : "+game.getCampaignText());
			System.out.println();
		}
		
	}
}
