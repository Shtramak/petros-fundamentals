package com.bobocode.hw3.warmup;

import com.bobocode.springbootserver.controller.dto.UserPicture;

/*
    1. Open a secure socket connection to api.nasa.gov
    2. Using socket API, get all pictures from NASA_URL
    3. Parse the response
    4. Find the original url (img_src value) and the size of the smallest picture
    5. Send POST request to spring-boot-server (run it from corresponding module) and print out the response
*/
public class NasaSmallestPictureWithSSL {
    private static final String NASA_URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=16&api_key=DEMO_KEY";

    public static UserPicture smallestUserPicture(){
        throw new UnsupportedOperationException();
    }
}
