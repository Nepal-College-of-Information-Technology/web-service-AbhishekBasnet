package com.example.nobsv2.product;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductService {
    public ResponseEntity<String> execute(){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product updated");
    }
}
