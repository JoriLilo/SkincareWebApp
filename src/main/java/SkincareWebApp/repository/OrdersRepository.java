package SkincareWebApp.repository;

import SkincareWebApp.entities.Orders;
import SkincareWebApp.entities.ProductEntity;
import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    // add
    Orders save(Orders order);

    // makeAnOrder
//    @Modifying
//    @Query("UPDATE Orders o SET o.status = 'IN_PROGRESS' WHERE o.id =?1")
//    Optional<Orders> makeAnOrder(Long orderId);
//
//    // addProductsToOrderList
//    @Modifying
//    @Query("UPDATE Orders o SET o.products =?2 WHERE o.id =?1")
//    Optional<Orders> addProductsToOrderList(Long orderId, List<ProductEntity> products);
}
