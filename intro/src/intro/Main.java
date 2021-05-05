package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hey");
		//camelCase - Bir deger tan�mland�g�nda degerin ilk harfi kucuk digrleri buyuk olur.
		String internetSubesiButonu="Internet Subesi";
		
		double dolarDun=8.45;
		double dolarBugun=8.45;
		
		//boolean artt�M�Azald�M�=true;
		if(dolarDun<dolarBugun) {
		System.out.println("Dolar Artt�");
		}
		else if (dolarBugun<dolarDun) {
			System.out.println("Dolar Azald�");
		}
		else {
			System.out.println("Dolar Sabit");
		}
		
		
		String[]krediler= 
			{
				"H�zl� kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Dugun kredisi",
				"Msb kredisi",
				"Ciftci kredisi",
				"Kultur Bakanl�g� kredisi"
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		System.out.println();
		System.out.println();

		
		for(int i =0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		System.out.println();
		System.out.println();
		//deger ve referans tipleri fark�
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		System.out.println();
		System.out.println();
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		//Veri tipleri iki sekilde tutulur. 1.Value Types(Deger tipleri) 2.Referance Types (referans tipleri)
		//genelde say�sal veri tipleri(int,double,float,boolean,byte) deger tip olarak tutulur. 
		//diziler,class,interface,abstract class gibi yap�lar ise referans tipidir.
		//yukar�da sayi1 in degeri sayi ikinin degerine esit olurken sayilar1 in referans� sayilar2 nin referans�na esi oldu.
		//say�lar haf�zada tutulurken Stack ve Heap isimli iki b�lgede tutulurlar. deger tipleri Stack bolgesinde tutulurken referans tipleri Heap b�lgesinde tutulur.
		//sayi1 esittir sayi2 dedigimizde sayi2 nin degerini sayi1 e vermis olduk fakat
		//dizilerde ise sayilar1 in degerleri sayilar2 nin referans�na bagl� oldugundan dolay� sayilar2 nin degerleri degistigi zaman sayilar1 degerlerini sayilar2 den ald�g�ndan dolay� sayilar1 in degerleri sayilar2 nin degerleri ile ayn� olmustur
		//deger tiplerinde atama yap�ld�ktan sonra sayi ve sayi2 aras�ndaki baglanti kopar
		//ancak referans tiplerinde ise bu baglant� kopmaz 
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);
		//burada string bir char dizisidir fakat istisnai olarak deger tipi olarak kullan�l�r. yani cevap istanbuldur.
	}

}
