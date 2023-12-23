package com.oussema.Projet_Rest.service;


import com.oussema.Projet_Rest.model.product;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Primary
public interface productService {

    // add product

    product addProduct(product p);

    // delete product

    ResponseEntity<?> deleteProduct(int id);

    // update product

    product updateProduct(product p);

    // get product by id

    product getProductById(int id);

    // get all products

    List<product> getAllProducts();

}