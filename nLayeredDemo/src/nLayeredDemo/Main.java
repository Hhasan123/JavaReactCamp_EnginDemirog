package nLayeredDemo;

import nLayeredDemo.Entities.concretes.Product;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccsess.concretes.AbcProductDao;

public class Main {
	
	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile ��z�lecek
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());//veya HibernateProductDao da kullan�labilir.
		
		Product product=new Product(1,2,"Elma",12);
		productService.add(product);
		
	}

}
//Bir projede entity ler hari� new leme varsa ilerde sorun c�kar�r.