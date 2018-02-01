package com.yjanati.dao;

import org.springframework.data.repository.CrudRepository;

import com.yjanati.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}