package Managers;

import Games.Games;

public class GamesStoreManager  extends GamesManager{
	double enBuyuk=0;
		public void siralaVeEkranaYerlestir(Games[] games) {
		System.out.println("----------Size uygun oyunlar?m?z a?a??dad?r----------");
		System.out.println();

		for (Games game : games) {
			System.out.println(game.getGameName()+" : "+game.getPrice()+"TL de?il s?n?rl? bir s?re i?in yaln?zca ==> "
					+ game.getPriceAfterDiscount() +"TL  %"+game.getDiscountRatio()+" kadar indirimle");
			
			System.out.println("---------- Size uygun kampanyalar?m?z a?a??dad?r----------");
			System.out.println(game.getCampaignId()+" : "+game.getCampaignText());
			System.out.println();
		}
		
	}
}
