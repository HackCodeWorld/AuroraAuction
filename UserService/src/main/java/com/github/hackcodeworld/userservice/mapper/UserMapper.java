package com.github.hackcodeworld.userservice.mapper;

import com.github.hackcodeworld.userservice.model.User;

public interface UserMapper {
    User findByUserID(String UserID);
    int insertUser(User user);
}
