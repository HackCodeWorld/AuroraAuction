package com.github.hackcodeworld.userservice.service.impl;

import com.github.hackcodeworld.userservice.mapper.UserMapper;
import com.github.hackcodeworld.userservice.model.UserRegisterDto;
import com.github.hackcodeworld.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public void registerUser(UserRegisterDto userRegisterDto) {

    }
}
