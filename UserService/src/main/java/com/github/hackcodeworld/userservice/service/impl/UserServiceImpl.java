package com.github.hackcodeworld.userservice.service.impl;

import com.github.hackcodeworld.userservice.mapper.UserMapper;
import com.github.hackcodeworld.userservice.model.User;
import com.github.hackcodeworld.userservice.model.UserRegisterDto;
import com.github.hackcodeworld.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    UserMapper userMapper;

    /**
     * implements the UserDetailsService.loadUserByUsername but actually using Email to search
     * @param Email
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {
        User user = userMapper.findByEmail(Email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with email: " + Email);
        }
        return null;
    }

    @Override
    public void registerUser(UserRegisterDto userRegisterDto) {

    }
}
