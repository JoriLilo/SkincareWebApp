package SkincareWebApp.thymeleaf.controller;

import SkincareWebApp.entities.*;
import SkincareWebApp.repository.OrdersRepository;
import SkincareWebApp.repository.UserRepository;
import SkincareWebApp.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SkincareController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrdersRepository orderRepository;

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        List<UserEntity> users = userRepository.findAll();
        List<Orders> orders = orderRepository.findAll();
        List<ProductEntity> products = productService.findAll();
        model.addAttribute("users", users);
        model.addAttribute("orders", orders);
        model.addAttribute("products", products);
        return "index";
    }

    @GetMapping("/orders")
    public String orders(Model model) {
        List<Orders> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @GetMapping("/admin")
    public String admins(Model model) {
        List<Admin> admin = new ArrayList<Admin>();
        model.addAttribute("Admin", admin);
        return "admin" ;
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<UserEntity> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/products")
    public String products(Model model) {
        List<ProductEntity> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/product-categories")
   public String productCategories(Model model) {
               List<ProductCategory> productCategories = new ArrayList<ProductCategory>();
                       model.addAttribute("productCategories", productCategories);
             return "product-categories";
           }





}
