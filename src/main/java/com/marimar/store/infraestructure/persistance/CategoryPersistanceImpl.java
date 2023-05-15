package com.marimar.store.infraestructure.persistance;


import com.marimar.store.domain.entity.Category;
import com.marimar.store.domain.persistance.CategoryPersistance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryPersistanceImpl implements CategoryPersistance {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryPersistanceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(Long categoryId) {
        return this.categoryRepository.findById(categoryId);
    }

    @Override
    public Category saveCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        this.categoryRepository.deleteById(categoryId);
    }
}