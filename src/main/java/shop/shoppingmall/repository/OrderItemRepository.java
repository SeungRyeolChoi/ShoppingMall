package shop.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.shoppingmall.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}