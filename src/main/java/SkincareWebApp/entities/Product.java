package SkincareWebApp.entities;


import SkincareWebApp.model.SkinType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="PRODUCT")

public class Product {


        private Long Id;
        private String name;
        private String description;
        private double price;
        private Integer stock;
        private Date expiryDate;
        private Integer quantity;
        private SkinType skinType;





}
