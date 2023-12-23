package com.oussema.Projet_Rest.controller;



import com.oussema.Projet_Rest.model.product;
import com.oussema.Projet_Rest.service.productService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class productController {

    private final productService productService1;

    public productController( productService productService1) {
        this.productService1 = productService1;
    }

    @GetMapping("/products")
    public String getProducts(){
        return productService1.getAllProducts().toString();
    }

    @PostMapping("/addProduct")
    public @ResponseBody product addProduct( @RequestBody  product p){
        return productService1.addProduct(p);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id){
        productService1.deleteProduct(id);
    }

    @PutMapping("/updateProduct")
    public @ResponseBody product updateProduct(@RequestBody product p){
        return productService1.updateProduct(p);
    }

    @GetMapping("/getProductById/{id}")

    public product getProductById(@PathVariable int id){
        return productService1.getProductById(id);
    }

}
