package SkincareWebApp.entities;

import jakarta.persistence.*;
//import org.hibernate.annotations.Table;

@Entity
@Table(name = "ProductCategory")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CategoryName", nullable = false)
    private String categoryName;
    @Column(name = "ProductID", nullable = false)
    private Long productId;
    // Constructors
    public ProductCategory() {}
    public ProductCategory(String categoryName, Long productId) {
        this.categoryName = categoryName;
        this.productId = productId;
    }
    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
