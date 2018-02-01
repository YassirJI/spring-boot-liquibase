package com.yjanati.services;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Component;

import com.yjanati.model.Category;
import com.yjanati.dao.CategoryRepository;

@Component
public class CategoryService {

  private CategoryRepository categoryRepository;

  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public Stream<Category> getAllCategories() {
    return StreamSupport.stream(categoryRepository.findAll().spliterator(), true);
  }
}