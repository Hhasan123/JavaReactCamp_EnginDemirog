package inheritance2;

public class FileLogger extends Logger {
	@Override  //Override i bir sýnýfýn base indeki metodu (miras olarak alýndýgý sýnýfýn icindeki ayný imzaya sahip metot) farkli bir sekilde calistirmak istedigimizde kullanýrýz. 
	public void log() {
			System.out.println("Dosya loglandý");
		}
}
