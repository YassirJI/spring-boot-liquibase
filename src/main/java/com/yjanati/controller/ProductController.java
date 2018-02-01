package com.yjanati.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yjanati.model.Product;

import com.yjanati.services.ProductService;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findProducts() {
        return this.productService.getAllProducts().collect(Collectors.toCollection(ArrayList::new));
    }
}
