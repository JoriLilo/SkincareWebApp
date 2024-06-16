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

    @GetMapping("/index")
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
        model.addAttribute("wishlist", orders);
        return "wishlist";
    }



    @GetMapping("/users")
    public String users(Model model) {
        List<UserEntity> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/produktet")
    public String products(Model model) {
        List<ProductEntity> products = productService.findAll();
        model.addAttribute("produktet", products);
        return "produktet";
    }

    @GetMapping("/anua")
   public String productCategories(Model model) {
               List<ProductCategory> productCategories = new ArrayList<ProductCategory>();
                       model.addAttribute("anua", productCategories);
             return "anua";
           }






}
