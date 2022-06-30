package com.bobocode.springbootserver.controller.dto;

import lombok.Value;

@Value
public class UserPicture {
    User user;
    Picture picture;
}
