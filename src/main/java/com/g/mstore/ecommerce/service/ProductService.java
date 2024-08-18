package com.g.mstore.ecommerce.service;


import com.g.mstore.ecommerce.model.Product;
import com.g.mstore.ecommerce.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    private final String FAKESTORE_API_URL = "https://fakestoreapi.com/products";

    public List<Product> fetchProducts() {
        Product[] products = restTemplate.getForObject(FAKESTORE_API_URL, Product[].class);
        return Arrays.asList(products);
    }

}
