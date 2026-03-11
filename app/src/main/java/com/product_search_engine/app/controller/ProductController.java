package com.product_search_engine.app.controller;

import com.product_search_engine.app.entity.Product;
import com.product_search_engine.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private  final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public ResponseEntity<Page<Product>>searchProduct(@RequestParam("keyword")String keyword, Pageable pageable) {

        return ResponseEntity.ok(productService.searchProducts(keyword,pageable));
    }
}
