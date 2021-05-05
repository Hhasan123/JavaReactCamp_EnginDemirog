package Managers;
import Gamers.Gamers;

public abstract class GamerManager implements GamersManager{
	@Override
	public void Add(Gamers gamer) {
		System.out.println("Oyuncu eklendi : "+gamer.getFirstName()+" "+gamer.getLastName());
	}
	@Override
	public void Update(Gamers gamer) {
		System.out.println("Oyuncu gŁncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}
	@Override
	public void Delete(Gamers gamer) {
		System.out.println("Oyuncu silindi : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}
}
