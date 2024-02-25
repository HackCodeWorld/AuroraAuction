package com.github.hackcodeworld.userservice.model;

import lombok.Data;

@Data
public class User {
    private String UserID; // UUID.randomUUID().toString() | PRIMARY
    private String Location;
    private String Country;
    private int Rating;
    private String Email;
    private String Password;
}


