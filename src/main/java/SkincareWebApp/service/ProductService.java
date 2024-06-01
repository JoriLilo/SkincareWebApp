package SkincareWebApp.service;

import SkincareWebApp.entities.ProductCategory;
import SkincareWebApp.entities.ProductEntity;
import SkincareWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {


    @Autowired
    private ProductRepository repository;

    public Optional<ProductEntity> findAllByName(String name){
        return repository.findAllByName(name);
    }
    public List<ProductEntity> findAll(){
        return repository.findAll();
    }

    public Optional<ProductEntity> findByCategory(ProductCategory category){
        return repository.findAllByCategory(category);
    }


}
