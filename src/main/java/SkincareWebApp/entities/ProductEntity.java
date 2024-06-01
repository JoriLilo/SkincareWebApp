package SkincareWebApp.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="PRODUCT")
@Data

public class ProductEntity {

        @Id
        @NotNull
        @Column(name = "PRODUCT_ID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long productId;

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

        @JoinColumn (name = "CATEGORY")
        @ManyToOne
        private ProductCategory category;

        @ManyToOne
        private Admin admin;

        @ManyToMany
        private List<Orders> orders;




}
