package shop.shoppingmall.repository;

import org.springframework.data.domain.Page;
import shop.shoppingmall.dto.ItemSearchDto;
import shop.shoppingmall.dto.MainItemDto;
import shop.shoppingmall.entity.Item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}