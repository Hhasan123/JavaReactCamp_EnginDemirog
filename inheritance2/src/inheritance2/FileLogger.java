package inheritance2;

public class FileLogger extends Logger {
	@Override  //Override i bir s�n�f�n base indeki metodu (miras olarak al�nd�g� s�n�f�n icindeki ayn� imzaya sahip metot) farkli bir sekilde calistirmak istedigimizde kullan�r�z. 
	public void log() {
			System.out.println("Dosya logland�");
		}
}
