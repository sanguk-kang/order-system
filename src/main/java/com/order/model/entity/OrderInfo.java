package com.order.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 주문 정보
 */
@Data
@Entity
@Table(name = "order_info")
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private String id;
    private String orderCode;
    private String orderStatus;
    private String userId;
    private String productId;
    private LocalDate startDate;
    private LocalDate endDate;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;

}
