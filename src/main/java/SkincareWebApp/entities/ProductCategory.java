package SkincareWebApp.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
//import org.hibernate.annotations.Table;

@Entity
@Table(name = "ProductCategory")
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CategoryName", nullable = false)
    private String categoryName;

    @OneToMany
    private List<ProductEntity> product;
}
