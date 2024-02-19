package com.dsinnovators.springbootdemo.services;

import com.dsinnovators.springbootdemo.entities.Product;
import com.dsinnovators.springbootdemo.entities.Supplier;
import com.dsinnovators.springbootdemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

}
