package com.vasilis_timoudas.product_service.repository;

import com.vasilis_timoudas.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
