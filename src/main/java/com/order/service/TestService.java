package com.order.service;

import com.order.model.dto.RequestTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class TestService {

    public RequestTest getTest() {
        System.out.println(">>>> test");
        RequestTest rt = new RequestTest();
        rt.setName("test");
        rt.setPhoneNum("01094950109");
        rt.setCreateDt(new Date());
        rt.setUpdateDt(new Date());

        return rt;
    }
}
