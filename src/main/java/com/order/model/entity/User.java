package com.order.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;
    private String userName;
    private String phoneNumber;
    private String birthDay;
    private String email;

    private Date createDate;
    private Date updateDate;

}
