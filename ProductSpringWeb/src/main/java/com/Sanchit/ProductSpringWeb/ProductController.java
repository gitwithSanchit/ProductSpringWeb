package com.Sanchit.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //hey this is for products request
    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return service.getAllProduct();
    }

    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name) {
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product p) {
        return service.addProduct(p);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id) {
        service.delete(id);
    }

}
