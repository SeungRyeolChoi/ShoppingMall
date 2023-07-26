package shop.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.shoppingmall.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByMemberId(Long memberId);
}