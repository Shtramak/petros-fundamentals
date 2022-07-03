package com.bobocode.springbootserver.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPicture {
    private User user;
    private Picture picture;
}
