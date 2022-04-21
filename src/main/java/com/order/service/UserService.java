package com.order.service;

import com.order.model.dto.UserDto;
import com.order.model.entity.UserInfo;
import com.order.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 회원 등록
     * @param userDto
     * @return
     */
    public UserInfo signup(UserDto userDto) {
        UserInfo userInfo = new UserInfo();

        BeanUtils.copyProperties(userDto, userInfo);
        LocalDateTime currentDat = LocalDateTime.now();
        userInfo.setCreateDate(currentDat);
        userInfo.setUpdateDate(currentDat);

        return userInfoRepository.save(userInfo);
    }

    /**
     * 회원 탈퇴
     * @param userDto
     * @return
     */
    public UserInfo withDrawal(UserDto userDto) {
        UserInfo userInfo = new UserInfo();
        return userInfo;
    }

    /**
     * 로그인
     * @param userDto
     * @return
     */
    public UserInfo login(UserDto userDto) {
        UserInfo userInfo = new UserInfo();
        return userInfo;
    }

    /**
     * 사용자 정보 조회
     * @param userId
     * @return
     */
    public UserInfo searchInfo(String userId) {
        UserInfo userInfo = new UserInfo();

        Optional<UserInfo> user = userInfoRepository.findById(userId);

        if (user.isPresent()) {
            userInfo = user.get();
        }

        return userInfo;
    }

    /**
     * 사용자 정보 수정
     * @param userDto
     * @return
     */
    public UserInfo editInfo(UserDto userDto) {
        UserInfo userInfo = new UserInfo();
        return userInfo;
    }

    /**
     * 중복 아이디 조회
     * @param id
     * @return
     */
    public Boolean existId(String id) {
        Optional<UserInfo> user = userInfoRepository.findById(id);
        if (!user.isPresent()) return true;
        return false;
    }

}
