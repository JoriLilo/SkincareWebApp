package SkincareWebApp.service;

import SkincareWebApp.entities.Admin;
import SkincareWebApp.entities.ProductCategory;
import SkincareWebApp.entities.ProductEntity;
import SkincareWebApp.entities.SkinType;
import SkincareWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {


    @Autowired
    private ProductRepository repository;

    public Optional<ProductEntity> findById(Long id){
        return repository.findById(id);
    }


    public Optional<ProductEntity> findAllByName(String name){
        return repository.findAllByName(name);
    }
    public List<ProductEntity> findAll(){
        return repository.findAll();
    }

    public Optional<ProductEntity> findByCategory(ProductCategory category){
        return repository.findAllByCategory(category);
    }

    public Optional<ProductEntity> findBySkinType(SkinType skinType){
        return repository.findAllBySkinType(skinType);
    }

    public ProductEntity save(ProductEntity entity) {
        return repository.save(entity);
    }

    public void delete(Long id) throws Exception {
        repository.delete(findById(id).orElseThrow(() -> new Exception("Cannot find admin!")));
    }


}
