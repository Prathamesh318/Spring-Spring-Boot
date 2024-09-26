package com.product.services;

import java.util.List;

import com.product.model.Product;

public interface ProductService {
	Product addProduct(Product P);

	Product findProductById(int id);

	List<Product> showAllProducts();

	void deleteProduct(int id);

	int updateProduct(int id, int quantity);

}
