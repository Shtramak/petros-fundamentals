package com.bobocode.hw1.web;

import java.util.List;
import java.util.Map;

public class NasaPhotosUtil {
    public static final String NASA_URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=15&api_key=DEMO_KEY";

    public static List<String> getPhotoUrlsUsingHttpClient() {
        // use JsonNode
        throw new UnsupportedOperationException();
    }

    public static List<String> getPhotoUrlsUsingWithRestTemplate() {
        //use Jackson as messageConverter under the hood of the RestTemplate
        throw new UnsupportedOperationException();
    }

    public static Map<String, Long> photosSizeByUrlUsingHttpClient() {
        throw new UnsupportedOperationException();
    }

    public static Map<String, Long> photosSizeByUrlUsingRestTemplate() {
        throw new UnsupportedOperationException();
    }

}
