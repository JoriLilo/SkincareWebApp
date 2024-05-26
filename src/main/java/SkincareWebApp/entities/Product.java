package SkincareWebApp.entities;


import SkincareWebApp.model.SkinType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
@Table(name="PRODUCT")

public class Product {

        @Id
        @Column(name = "PRODUCT_ID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long Id;
        @Column(name = "NAME")
        @NotNull
        private String name;

        @Column(name = "DESCRIPTION")
        private String description;

        @Column(name = "PRICE")
        private double price;

        @Column(name = "STOCK")
        private Integer stock;

        @Column(name = "EXPIRY_DATE")
        private Date expiryDate;

        @Column(name = "QUANTITY")
        private Integer quantity;

        @Column(name = "SKIN_TYPE")
        private SkinType skinType;





}
