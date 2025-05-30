package com.example.nobsv2.product.services;

import com.example.nobsv2.product.Query;
import com.example.nobsv2.product.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductsSercice implements Query<Void, List<Product>> {


    private final ProductRepository productRepository;

    public GetProductsSercice(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<List<Product>> execute(Void input) {
        List<Product> products = productRepository.findAll();

        return ResponseEntity.status(HttpStatus.CREATED).body(products);
    }
}
