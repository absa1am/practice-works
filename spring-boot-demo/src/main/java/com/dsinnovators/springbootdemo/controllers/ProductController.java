package com.dsinnovators.springbootdemo.controllers;

import com.dsinnovators.springbootdemo.entities.Product;
import com.dsinnovators.springbootdemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/product/{id}")
    public Product product(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/products")
    public List<Product> products() {
        return productService.getProducts();
    }

}
