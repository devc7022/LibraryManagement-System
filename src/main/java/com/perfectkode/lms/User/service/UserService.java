package com.perfectkode.lms.User.service;

import com.perfectkode.lms.User.dto.userRequestDto;
import com.perfectkode.lms.User.dto.userResponseDto;
import com.perfectkode.lms.User.entity.User;
import com.perfectkode.lms.User.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public userResponseDto saveUser(userRequestDto dto){
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        User savedUser = userRepo.save(user);
        userResponseDto response = new userResponseDto();
        response.setId(savedUser.getId());
        response.setName(savedUser.getName());
        response.setEmail(savedUser.getEmail());

        return response;
    }

}
