package com.order.service;

import com.order.model.dto.UserDto;
import com.order.model.entity.User;
import com.order.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User signup(UserDto userDto) {
        User user = new User();

        BeanUtils.copyProperties(userDto, user);

        log.debug("dto:", userDto.toString());
        log.debug("user:", user.toString());
        log.debug("data: ", user.getUserName());

        return userRepository.save(user);
    }
}
