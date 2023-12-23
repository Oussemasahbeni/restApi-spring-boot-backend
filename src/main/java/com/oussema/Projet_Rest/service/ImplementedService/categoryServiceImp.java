package com.oussema.Projet_Rest.service.ImplementedService;

import com.oussema.Projet_Rest.model.Category;
import com.oussema.Projet_Rest.service.categoryService;
import com.oussema.Projet_Rest.repository.categoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class categoryServiceImp implements categoryService {

    private final categoryRepository categoryRepo;


    public categoryServiceImp(categoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category addCategory(Category c) {
        return categoryRepo.save(c);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category updateCategory(Category c) {
        return  categoryRepo.save(c);
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepo.findById(id).orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }


}
