package com.spring.boot.learning.springboottestingtypes.rest;

import com.spring.boot.learning.springboottestingtypes.domain.Product;
import com.spring.boot.learning.springboottestingtypes.domain.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
        System.out.println("--------ProductController()---------");
    }

    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
