package com.hexaware.ProductService;

import com.hexaware.ProductService.Dao.ProductDao;
import com.hexaware.ProductService.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {
    private ProductDao productDao;

    @Autowired
    public DataLoader(ProductDao productDao){
        this.productDao = productDao;
    }

    @PostConstruct
    private void loadData(){
        //delete in database
        productDao.deleteAll();

        // create products
        addData();

    }

    public void addData(){
        Product product1 = new Product(101,"Galaxy", 1200);
        Product product2 = new Product(202,"iPhone 13", 1300);
        Product product3 = new Product(303,"Pixel", 900);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
    }

}
