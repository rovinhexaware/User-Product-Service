package com.hexaware.ProductService.Service;

import com.hexaware.ProductService.Entity.Product;

import java.util.List;


public interface ProductService {
    List<Product> listAllproducts();
    Product listProductById(int id);
    Product add(Product product);
}
