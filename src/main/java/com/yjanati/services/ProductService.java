package com.yjanati.services;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Component;

import com.yjanati.model.Product;
import com.yjanati.dao.ProductRepository;

@Component
public class ProductService {

  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Stream<Product> getAllProducts() {
    return StreamSupport.stream(productRepository.findAll().spliterator(), true);
  }
}
