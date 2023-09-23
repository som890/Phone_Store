package com.phonestore.phone_store.controller;

import com.phonestore.phone_store.entity.Product;
import com.phonestore.phone_store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public Product addNewProduct(@RequestBody Product product) {
        return productService.addNewProduct(product);
    }
}
