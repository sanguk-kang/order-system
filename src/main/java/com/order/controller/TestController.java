package com.order.controller;

import com.order.model.dto.RequestTest;
import com.order.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/sample")
    public RequestTest getTest() {
        return testService.getTest();
    }
}
