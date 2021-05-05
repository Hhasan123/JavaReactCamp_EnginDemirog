package oopIntro;

public class Product {
	
	//encapsulation
	private int id;                //final ifadesi elemalarýn dýsardan erisimini kýsýtlar.
	private String name;           //final yalnýzca constructor da set edilebilir demektir.
	private double unitPrice;      //private yalnýzca bulundugu sýnýfýn icerisinde kullanýlabilir demek
	private String detail;
	private double discount;
	
	public Product() {
		
	}
		
	
	public Product(int id, String name, double unitPrice, 
			String detail,double discount) {
		super();           //sað týk source->Generate Constructor using Fields =9-15 satýrlar
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;

	}
	
	public int getId() {                 //sað týk source->Generate getters and setters 22-54 satýrlar
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
		
}