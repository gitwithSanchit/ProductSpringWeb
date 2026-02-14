package com.Sanchit.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    public Product addProduct(Product p) {
        return db.save(p);
    }

    public List<Product> getAllProduct() {
        return db.findAll();
    }

    public Product getProduct(String name) {
        return db.findByName(name);
    }

    public void delete(int id) {
        db.deleteById(id);
    }
//
//    public Product getByPlace(String place) {
//
//        return products.stream()
//                .filter(p -> p.getPlace().equals(place))
//                .findFirst()
//                .orElse(null);
//    }
//
//
//    public List<Product> getWarrantyExpiredProducts(int year) {
//
//        return products.stream()
//                .filter(p -> p.getWarranty() < year)
//                .toList();
//    }
//
//    public List<Product> getProductWithText(String Text) {
//
//        String str = Text.toLowerCase();
//
//        return products.stream()
//                .filter(p ->
//                        p.getName().toLowerCase().contains(str) ||
//                        p.getType().toLowerCase().contains(str) ||
//                        p.getPlace().toLowerCase().contains(str)
//                )
//                .toList();
//    }
}
