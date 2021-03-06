package com.rimumu.shop.dto;


import lombok.Getter;
import lombok.Setter;

// 장바구니 조회시 생성자 생성으로 전달 될 dto
@Getter @Setter
public class CartDetailDto {

    private Long cartItemId; // 장바구니 상품 아이디

    private String itemNm; // 상품명

    private int price; // 가격

    private int count; //수량

    private String imgUrl; // 상품 이미지 경로

    public CartDetailDto(Long cartItemId, String itemNm, int price, int count, String imgUrl) {
        this.cartItemId = cartItemId;
        this.itemNm = itemNm;
        this.price = price;
        this.count = count;
        this.imgUrl = imgUrl;
    }

}
