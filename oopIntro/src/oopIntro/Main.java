package oopIntro;

public class Main {

	public static void main(String[] args) {
		
	
		Product product2= new Product();  
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());  
		System.out.println(category2.getName());  
//diyelim ki ayný sýnýftan türetilen tüm nesnelere ayný þey uygulanacak ornegin category1
//ve category2 nin isimlerine ! isareti eklemek istedigimiz zaman yalnýzca ilgili nesnenin sýnýfýndaký 
//parametrenin get bolumunu degistirmek yeterli olur yukarýdak ornek icin bu Category.java dosyasýndasýnda
//26. satýra denk gelmektedir.
		
	}

}
