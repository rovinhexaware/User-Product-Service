package com.hexaware.ProductService.Service;

import com.hexaware.ProductService.Dao.ProductDao;
import com.hexaware.ProductService.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImplementation implements ProductService {
    @Autowired
    private ProductDao productDao;


    @Override
    public List<Product> listAllproducts() {
        return productDao.findAll();
    }

    @Override
    public Product listProductById(int id) {
        Optional<Product> product = productDao.findById(id);

        return product.orElse(null);
    }

    @Override
    public Product add(Product product) {
        return productDao.save(product);
    }
}
