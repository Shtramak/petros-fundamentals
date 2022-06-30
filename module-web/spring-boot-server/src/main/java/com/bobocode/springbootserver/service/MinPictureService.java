package com.bobocode.springbootserver.service;

import com.bobocode.springbootserver.controller.dto.Picture;

public interface MinPictureService {
    String NASA_URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=16&api_key=DEMO_KEY";

    Picture picture();
}
