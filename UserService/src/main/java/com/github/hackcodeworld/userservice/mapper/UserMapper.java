package com.github.hackcodeworld.userservice.mapper;

import com.github.hackcodeworld.userservice.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByUserID(String UserID);
    int insertUser(User user);
    User findByEmail(String Email);
}
