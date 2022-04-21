package com.order.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 제품 정보
 */
@Data
@Entity
@Table(name = "product_info")
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private String id;
    private String productName;
    private String productStatus;
    private String registUserId;
    private String registDate;
    private LocalDate expirationDate;

    private Integer productPrice;
    private Integer productCount;
    private String productDesc;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;


}
