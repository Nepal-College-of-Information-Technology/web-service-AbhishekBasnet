package com.example.nobsv2.product;

import com.example.nobsv2.product.model.Product;
import com.example.nobsv2.product.services.CreateProductService;
import com.example.nobsv2.product.services.DeleteProductService;
import com.example.nobsv2.product.services.GetProductsSercice;
import com.example.nobsv2.product.services.UpdateProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final CreateProductService createProductService;

    private final GetProductsSercice getProductsSercice;

    private final UpdateProductService updateProductService;

    private final DeleteProductService deleteProductService;

    public ProductController(CreateProductService createProductService,
                             GetProductsSercice getProductsSercice,
                             UpdateProductService updateProductService,
                             DeleteProductService deleteProductService) {
        this.createProductService = createProductService;
        this.getProductsSercice = getProductsSercice;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
    }

    @PostMapping
    public ResponseEntity<String> createProduct(){

        return createProductService.execute(null);
    }


    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return getProductsSercice.execute(null);

    }

    @PutMapping
    public ResponseEntity<String> updateProduct(){
        return updateProductService.execute(null);

    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct(){
        return deleteProductService.execute(null);

    }
}