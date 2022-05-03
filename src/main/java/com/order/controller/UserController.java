package com.order.controller;

import com.order.model.dto.UserDto;
import com.order.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 회원 등록
     * @param userDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, path = "/info")
    public ResponseEntity<Object> signup(@RequestBody @Valid UserDto userDto) {
        return new ResponseEntity<>(userService.signup(userDto), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/exists/{id}")
    public ResponseEntity<Object> existsId(@PathVariable("id") String id) {
        return new ResponseEntity<>(userService.existId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/info/{id}")
    public ResponseEntity<Object> searchInfo(@PathVariable("id") String id) {
        return new ResponseEntity<>(userService.searchInfo(id), HttpStatus.OK);
    }



}
