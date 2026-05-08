package com.perfectkode.lms.User.controller;

import com.perfectkode.lms.User.dto.userRequestDto;
import com.perfectkode.lms.User.dto.userResponseDto;
import com.perfectkode.lms.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public userResponseDto createUser(@RequestBody userRequestDto dto){
        return userService.saveUser(dto);
    }

}
