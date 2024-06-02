package SkincareWebApp.service;

import SkincareWebApp.entities.Orders;
import SkincareWebApp.entities.ProductEntity;
import SkincareWebApp.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

        @Autowired
        private OrdersRepository ordersRepository;

        // add
        public Orders addOrder(Orders order) {
            return ordersRepository.save(order);
        }}

        // makeAnOrder
//        public void makeAnOrder(Long orderId) {
//            ordersRepository.makeAnOrder(orderId);
//        }
//
//        // addProductsToOrderList
//        public void addProductsToOrderList(Long orderId, List<ProductEntity> products) {
//            ordersRepository.addProductsToOrderList(orderId, products);
//        }
//    }


