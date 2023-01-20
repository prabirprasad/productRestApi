package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> listAll() {
		return productRepo.findAll();
	}
	
	public void save(Product product) {
		productRepo.save(product);
	}
	
	public Product get(Integer id) {
		return productRepo.findById(id).get();
	}
	
	public void delete(Integer id) {
		productRepo.deleteById(id);
	}
	
}
