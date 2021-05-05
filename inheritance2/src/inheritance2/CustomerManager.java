package inheritance2;

public class CustomerManager {
	public void Add(Logger logger) {
		
		System.out.println("Müþteri eklendi");
		logger.log();
	}
}


//Bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanacaksa asla
//somut sýnýf(iþ yapan sýnýf örn file database email iþlemleri yapan siniflar) ýn 
//kodlarý (o sýnýfýn kendi kodlarý) deðiþtirilmemelidir.

//Bir kodun içerisinde baþka bir iþ yapan kod new lenirse o kod ileride sorun çýkaracaktýr
//ve sürdürülebilir deðildir.