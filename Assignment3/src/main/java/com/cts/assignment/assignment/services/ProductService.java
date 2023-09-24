package com.cts.assignment.assignment.services;

import com.cts.assignment.assignment.entities.Product;
import com.cts.assignment.assignment.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    //get All Products
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    //add Product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    //get Product by id
    public Optional<Product> findByProductId(long pid) {
        return productRepository.findById(pid);
    }

    //Update product
    public Product updateProduct(long id, Product product) {
        Optional<Product> optionalProduct = findByProductId(id);
        if (optionalProduct.isPresent()) {
            Product productfinal = new Product();
            productfinal.setId(id);
            productfinal.setName(product.getName());
            productfinal.setDescription(product.getDescription());
            productfinal.setStock(product.getStock());
            return productRepository.save(productfinal);
        }
        return null;
    }

    //delete Product by id
    public void deleteProduct(long pid) {
        productRepository.deleteById(pid);
    }
    // Other CRUD methods ...
}
