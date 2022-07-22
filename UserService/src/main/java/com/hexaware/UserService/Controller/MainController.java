package com.hexaware.UserService.Controller;

import com.hexaware.UserService.Product;
import com.hexaware.UserService.Service.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductServiceProxy service;

    @GetMapping("/products")
    public List<Product> GetProducts(){
        return service.GetProducts();
    }

    @GetMapping("/products/{id}")
    public Product GetProductById(@PathVariable int id){
        return service.GetProductById(id);
    }

    @PostMapping("/products/")
    public Product AddProduct(@RequestBody Product product){
        return service.AddProduct(product);
    }


}
