package com.bobocode.springbootserver.controller;

import com.bobocode.springbootserver.controller.dto.User;
import com.bobocode.springbootserver.controller.dto.UserPicture;
import com.bobocode.springbootserver.service.MinPictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/user-picture")
@RequiredArgsConstructor
public class UserImageController {
    private final MinPictureService minPictureService;

    @PostMapping
    public ResponseEntity<String> userPicture(@RequestBody UserPicture userPicture) {
        var picture = userPicture.getPicture();
        if (picture.equals(minPictureService.picture())) {
            return ResponseEntity.ok(String.format("WELL DONE, %s", Optional.ofNullable(userPicture.getUser())
                    .map(User::getFirstName)
                    .orElseThrow(() -> new NoSuchElementException("No user firstName found"))));
        }
        return ResponseEntity.badRequest().body("Something wrong with the body or wrong picture data");

    }
}
