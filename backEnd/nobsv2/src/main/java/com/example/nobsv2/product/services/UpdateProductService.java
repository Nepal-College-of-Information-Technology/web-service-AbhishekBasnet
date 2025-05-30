package com.example.nobsv2.product.services;


import com.example.nobsv2.product.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateProductService implements Query<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
         return ResponseEntity.status(HttpStatus.OK).body("Product Updated");
    }
}
