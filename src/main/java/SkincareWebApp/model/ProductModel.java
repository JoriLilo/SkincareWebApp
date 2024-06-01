package SkincareWebApp.model;

import SkincareWebApp.entities.ProductCategory;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

    private Long Id;

    @NotNull
    private String name;
    private String description;
    @NotNull
    private double price;
    @NotNull
    private Integer stock;
    @NotNull
    private Date expiryDate;
    @NotNull
    private Integer quantity;
    @NotNull
    private SkinType skinType;
    @NotNull
    private ProductCategory category;

}
