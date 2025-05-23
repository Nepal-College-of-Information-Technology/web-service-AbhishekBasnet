package com.example.nobsv2.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private CreateProductService createProductService;

    @Autowired
    private GetProductService getProductService;

    @Autowired
    private UpdateProductService updateProductService;

    @Autowired
    private DeleteProductService deleteProductService;

    @PostMapping
    public ResponseEntity<String> createProduct(){
        return createProductService.execute();
    }


    @GetMapping
    public ResponseEntity<String> getProduct() {
        return getProductService.execute();

    }

    @GetMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute();

    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.execute();

    }
}