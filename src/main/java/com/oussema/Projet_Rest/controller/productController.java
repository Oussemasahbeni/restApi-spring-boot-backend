package com.oussema.Projet_Rest.controller;



import com.oussema.Projet_Rest.model.product;
import com.oussema.Projet_Rest.service.productService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class productController {

    private final productService productService1;



    public productController( productService productService1) {
        this.productService1 = productService1;
    }

    @GetMapping("/products")
    public List<product> getProducts(){
        return productService1.getAllProducts();
    }

    @PostMapping("/addProduct")
    public @ResponseBody product addProduct( @RequestBody  product p){

        System.out.println(p);


        return productService1.addProduct(p);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
       return  productService1.deleteProduct(id);
    }

    @PatchMapping("/updateProduct")
    public @ResponseBody product updateProduct(@RequestBody product p){
        return productService1.updateProduct(p);
    }

    @GetMapping("/product/{id}")

    public product getProductById(@PathVariable int id){
        return productService1.getProductById(id);
    }

}
