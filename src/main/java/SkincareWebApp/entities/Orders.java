package SkincareWebApp.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Orders_Id")
    private Long orderId;

    @ManyToMany
    private List<ProductEntity> productId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userId;

    @Column(name = "TotalAmount", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "OrderDate", nullable = false)
    private LocalDateTime orderDate;

    @Column(name ="TypeOfPayment")
    private TypeOfPayment typeOfPayment;


}
