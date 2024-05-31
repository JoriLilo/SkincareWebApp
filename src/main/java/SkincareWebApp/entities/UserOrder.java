package SkincareWebApp.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "UserOrder")
@Data
public class UserOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private Long orderId;
    @Column(name = "ProductID", nullable = false)
    private Long productId;
    @Column(name = "UserID", nullable = false)
    private Long userId;
    @Column(name = "TotalAmount", nullable = false)
    private BigDecimal totalAmount;
    @Column(name = "OrderDate", nullable = false)
    private LocalDateTime orderDate;


}
