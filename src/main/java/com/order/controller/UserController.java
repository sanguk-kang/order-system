package com.order.controller;

import com.order.model.dto.UserDto;
import com.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "/info")
    public ResponseEntity<Object> postInfo(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.signup(userDto), HttpStatus.OK);
    }
}
