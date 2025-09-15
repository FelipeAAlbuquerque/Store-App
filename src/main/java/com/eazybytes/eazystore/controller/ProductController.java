package com.eazybytes.eazystore.controller;

import com.eazybytes.eazystore.entity.Product;
import com.eazybytes.eazystore.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @GetMapping
    public List<Product> getProducts() {
        return repository.findAll();
    }
}
