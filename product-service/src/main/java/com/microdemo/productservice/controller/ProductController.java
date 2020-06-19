package com.microdemo.productservice.controller;

import com.microdemo.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

public class ProductController {


    @GetMapping("products")
    public List<Product> getAll() {
        return Arrays.asList(
                new Product(1, "Product 1" , 3),
                new Product(2, "Product 2", 1),
                new Product(3, "Product 3", 2)
        );
    }

    @GetMapping("products/{id}")
    public Product getOne(@PathParam("id") int id) {
        return new Product(id, "Product ", 2);

    }
}
