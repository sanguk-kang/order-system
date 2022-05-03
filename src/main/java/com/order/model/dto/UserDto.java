package com.order.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserDto {

    @NotNull
    @Size(min = 3, max = 10)
    private String userId;
    private String userName;
    private String phoneNumber;
    private String birthDay;
    private String email;

}
