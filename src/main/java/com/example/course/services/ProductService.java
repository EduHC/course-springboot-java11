package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Products;
import com.example.course.repositories.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> findAll() {
		return productRepository.findAll();
	}
	
	public Products findById(Long id) {
		Optional<Products> product = productRepository.findById(id);
		
		return product.get();
	}
}
