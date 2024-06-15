package SkincareWebApp.thymeleaf.controller;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;


public class thymeleafViewResolver {
 @Bean
 public ThymeleafViewResolver thymeleafViewResolver() {
  ThymeleafViewResolver resolver = new ThymeleafViewResolver();
  resolver.setTemplateEngine(new SpringTemplateEngine());
  resolver.setCharacterEncoding("UTF-8");
  resolver.setOrder(1);
  return resolver;

 }
}