package com.example.nobsv2.product.services;

import com.example.nobsv2.product.Query;
import com.example.nobsv2.product.model.Product;
import com.example.nobsv2.product.model.ProductDTO;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class GetProductService implements Query<Integer, ProductDTO> {

    private final ProductRepository productRepository;

    public GetProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<ProductDTO> execute(Integer input) {

        Optional<Product> productOptional = productRepository.findById(input);

        return productOptional.map(product -> ResponseEntity.ok(new ProductDTO(product))).orElse(null);
    }
}
