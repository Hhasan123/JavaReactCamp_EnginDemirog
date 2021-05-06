package nLayeredDemo.dataAccsess.concretes;

import java.util.List;

import nLayeredDemo.Entities.concretes.Product;
import nLayeredDemo.dataAccsess.abstracts.ProductDao;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernete ile eklendi : "+ product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernete ile güncellendi : "+ product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernete ile silindi : "+ product.getName());
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

//Hibernate veri tabaný ile iletiþim kuran java yapýsýdýr.