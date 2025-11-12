package com.shoppingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shoppingapp.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> { }
