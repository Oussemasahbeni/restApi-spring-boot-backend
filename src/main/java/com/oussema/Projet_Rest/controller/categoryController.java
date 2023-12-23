package com.oussema.Projet_Rest.controller;

import com.oussema.Projet_Rest.model.Category;
import com.oussema.Projet_Rest.model.product;
import com.oussema.Projet_Rest.service.categoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class categoryController {

    private final categoryService categoryService1;

    public categoryController(categoryService categoryService1) {
        this.categoryService1 = categoryService1;
    }


    @GetMapping("/categories")
    public String getProducts(){
        return categoryService1.getAllCategories().toString();
    }

    @PostMapping("/addCategory")
    public @ResponseBody Category addProduct(@RequestBody Category c){
        return categoryService1.addCategory(c);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public void deleteProduct(@PathVariable int id){
        categoryService1.deleteCategory(id);
    }

    @PutMapping("/updateCategory")
    public @ResponseBody Category updateProduct(@RequestBody Category c){
        return categoryService1.updateCategory(c);
    }

    @GetMapping("/getCategoryById/{id}")

    public Category getProductById(@PathVariable int id){
        return categoryService1.getCategoryById(id);
    }

}