package com.oussema.Projet_Rest.service.ImplementedService;

import com.oussema.Projet_Rest.model.product;
import com.oussema.Projet_Rest.repository.productRepository;
import com.oussema.Projet_Rest.service.productService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImp implements productService {

    private final productRepository productRepo;


    public productServiceImp(productRepository product) {
        this.productRepo = product;
    }

    @Override
    public product addProduct(product p) {
        return productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id){
         productRepo.deleteById(id);
    }

    @Override
    public product updateProduct (product p){
        return productRepo.save(p);
    }

    @Override
    public product getProductById(int id){
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<product> getAllProducts(){
        return productRepo.findAll();
    }

}
