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
		category1.setName("��ecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());  
		System.out.println(category2.getName());  
//diyelim ki ayn� s�n�ftan t�retilen t�m nesnelere ayn� �ey uygulanacak ornegin category1
//ve category2 nin isimlerine ! isareti eklemek istedigimiz zaman yaln�zca ilgili nesnenin s�n�f�ndak� 
//parametrenin get bolumunu degistirmek yeterli olur yukar�dak ornek icin bu Category.java dosyas�ndas�nda
//26. sat�ra denk gelmektedir.
		
	}

}
