package com.krnelx.RESTSwaggerProductManagement.repository;

import com.krnelx.RESTSwaggerProductManagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}