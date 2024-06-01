package SkincareWebApp.service;

import SkincareWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {


    @Autowired
    private ProductRepository repository;

    public  void getByName(String name){
        repository.getByName(name);
    }


}
