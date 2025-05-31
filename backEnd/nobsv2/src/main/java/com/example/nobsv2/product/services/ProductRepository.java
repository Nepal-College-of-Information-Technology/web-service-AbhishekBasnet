package com.example.nobsv2.product.services;

import com.example.nobsv2.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//this JPA Repo gives me access to some free methods to execute on database

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
