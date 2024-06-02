package SkincareWebApp.repository;

import SkincareWebApp.entities.Orders;
import SkincareWebApp.entities.ProductEntity;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    // add
    Orders save(Order order);

    // makeAnOrder
    @Modifying
    @Query("UPDATE Order o SET o.status = 'IN_PROGRESS' WHERE o.id =?1")
    void makeAnOrder(Long orderId);

    // addProductsToOrderList
    @Modifying
    @Query("UPDATE Order o SET o.products =?2 WHERE o.id =?1")
    void addProductsToOrderList(Long orderId, List<ProductEntity> products);
}
