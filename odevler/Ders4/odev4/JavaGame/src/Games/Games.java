package Games;

import Campaigns.Campaigns;

public class Games extends Campaigns{
	private int gameId;
	private String gameName;
	private double price;
	private double discountRatio;
	private double priceAfterDiscount;
	private String gameDesctription;
	private String gameOwner;
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountRatio() {
		return discountRatio;
	}
	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	public String getGameDesctription() {
		return gameDesctription;
	}
	public void setGameDesctription(String gameDesctription) {
		this.gameDesctription = gameDesctription;
	}
	public String getGameOwner() {
		return gameOwner;
	}
	public void setGameOwner(String gameOwner) {
		this.gameOwner = gameOwner;
	}
	public double getPriceAfterDiscount() {
		return (getPrice()-(getPrice()*getDiscountRatio()/100));
	}
	
}
