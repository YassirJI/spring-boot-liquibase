package com.yjanati.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yjanati.services.CategoryService;

import com.yjanati.model.Category;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> findCategories() {
        return this.categoryService.getAllCategories().collect(Collectors.toCollection(ArrayList::new));
    }
}
