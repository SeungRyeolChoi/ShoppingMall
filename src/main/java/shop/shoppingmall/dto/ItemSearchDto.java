package shop.shoppingmall.dto;

import lombok.Getter;
import lombok.Setter;
import shop.shoppingmall.constant.ItemSellStatus;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";

}