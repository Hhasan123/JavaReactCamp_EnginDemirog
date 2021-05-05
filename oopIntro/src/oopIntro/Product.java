package oopIntro;

public class Product {
	
	//encapsulation
	private int id;                //final ifadesi elemalar�n d�sardan erisimini k�s�tlar.
	private String name;           //final yaln�zca constructor da set edilebilir demektir.
	private double unitPrice;      //private yaln�zca bulundugu s�n�f�n icerisinde kullan�labilir demek
	private String detail;
	private double discount;
	
	public Product() {
		
	}
		
	
	public Product(int id, String name, double unitPrice, 
			String detail,double discount) {
		super();           //sa� t�k source->Generate Constructor using Fields =9-15 sat�rlar
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;

	}
	
	public int getId() {                 //sa� t�k source->Generate getters and setters 22-54 sat�rlar
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