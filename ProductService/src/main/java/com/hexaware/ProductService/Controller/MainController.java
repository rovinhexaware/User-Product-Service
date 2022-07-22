package com.hexaware.ProductService.Controller;

import com.hexaware.ProductService.Entity.Product;
import com.hexaware.ProductService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products/")
    public Product AddProduct(@RequestBody  Product product){
        return productService.add(product);
    }

    @GetMapping("/products/")
    public List<Product> GetProducts(){
        return productService.listAllproducts();
    }

    @GetMapping("/products/{id}")
    public Product GetProductById(@PathVariable int id){
        return productService.listProductById(id);
    }

}
