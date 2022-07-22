package com.hexaware.UserService.Service;

import com.hexaware.UserService.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "http://localhost:90", name = "product-service")
public interface ProductServiceProxy {
    @GetMapping("/products/{id}")
    public Product GetProductById(@PathVariable int id);

    @GetMapping("/products/")
    public List<Product> GetProducts();

    @PostMapping("/products/")
    public Product AddProduct(@RequestBody Product product);
}
