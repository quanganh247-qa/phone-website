package com.bezkoder.spring.jwt.mongodb.repository;

import com.bezkoder.spring.jwt.mongodb.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findByPdName(String Name);
    Product findByProductId(String id);
    void deleteProductByProductId(String id);
    List<Product> findAll() ;

}
