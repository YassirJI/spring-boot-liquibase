package com.yjanati.dao;

import org.springframework.data.repository.CrudRepository;

import com.yjanati.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}