package nLayeredDemo.Entities.concretes;

import nLayeredDemo.Entities.abstracts.Entity;

public class Product implements Entity{
	private int id;
	private int kategoryId;
	private String name;
	private double unit;
	
	public Product() {}

	public Product(int id, int kategoryId, String name, double unit) {
		super();
		this.id = id;
		this.kategoryId = kategoryId;
		this.name = name;
		this.unit = unit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKategoryId() {
		return kategoryId;
	}

	public void setKategoryId(int kategoryId) {
		this.kategoryId = kategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}
	
}
//Bir class  çýplak kalmamalý (en az bir interfece abstract veya inheritance kullanmalý)
