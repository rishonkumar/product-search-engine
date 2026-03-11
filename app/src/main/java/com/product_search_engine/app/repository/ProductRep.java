package com.product_search_engine.app.repository;

import com.product_search_engine.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRep extends JpaRepository<Product,Long> {


}
