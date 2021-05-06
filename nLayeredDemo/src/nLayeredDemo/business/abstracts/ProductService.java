package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.Entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
