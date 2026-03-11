package com.product_search_engine.app.service;

import com.product_search_engine.app.entity.Product;
import com.product_search_engine.app.repository.ProductRep;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private  final ProductRep productRep;

    public ProductService(ProductRep productRep) {
        this.productRep = productRep;
    }

    public Page<Product> searchProducts(String keyword, Pageable pageable) {
        Pageable req = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("productPrice").descending());
        return productRep.findAll(req);
    }
}
