package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{
}
