package Gamers;

import Games.Games;

public class Gamers {
	private int gamersId;
	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String nationalId;
	private Games games[];
	
	public int getGamersId() {
		return gamersId;
	}
	public void setGamersId(int gamersId) {
		this.gamersId = gamersId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthOfYear() {
		return birthOfYear;
	}
	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public Games[] getGames() {
		return games;
	}
	public void setGames(Games[] games) {
		this.games = games;
	}
	
}
