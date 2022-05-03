package com.order.model.entity;

import lombok.Cleanup;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 사용자 정보
 */
@Data
@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @Column(name = "userId")
    private String id;
    private String userName;
    private String phoneNumber;
    private String birthDay;
    private String email;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;


    @ManyToMany
    @JoinTable(
            name = "order_info",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<ProductInfo> productInfos;

    @OneToMany
    @JoinColumn(name = "registUserId")
    private List<ProductInfo> productInfo;



}
