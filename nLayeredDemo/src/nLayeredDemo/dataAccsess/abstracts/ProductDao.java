package nLayeredDemo.dataAccsess.abstracts;

import java.util.List;

import nLayeredDemo.Entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();  //List bir interface dir ve generic yap�dad�r ayr�ca ArrayList in base sidir.
}

