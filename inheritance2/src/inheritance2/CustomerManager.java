package inheritance2;

public class CustomerManager {
	public void Add(Logger logger) {
		
		System.out.println("M��teri eklendi");
		logger.log();
	}
}


//Bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanacaksa asla
//somut s�n�f(i� yapan s�n�f �rn file database email i�lemleri yapan siniflar) �n 
//kodlar� (o s�n�f�n kendi kodlar�) de�i�tirilmemelidir.

//Bir kodun i�erisinde ba�ka bir i� yapan kod new lenirse o kod ileride sorun ��karacakt�r
//ve s�rd�r�lebilir de�ildir.