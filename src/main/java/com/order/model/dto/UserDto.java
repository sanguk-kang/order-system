package com.order.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private String userId;
    private String userName;
    private String phoneNumber;
    private String birthDay;
    private String email;

}
