package com.skcprac.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcprac.billingsoftware.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity , Long> {
    
    
}
