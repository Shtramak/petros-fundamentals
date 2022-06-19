package com.bobocode.hw2.warmup.smallestpicture;

import lombok.Data;

import java.util.List;
import java.util.Map;

public class RestTemplateUtils {
    private static final String NASA_URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=14&api_key=DEMO_KEY";

/*
    Using Spring RestTemplate and Jackson mapper find all photos and group them into map by sizes. Keys should be sorted in descending order
    Don't use JsonNode or parsing String response. Map everything with Jackson.
    Use Stream API to aggregate method response.
    Add required dependencies to pom
*/
    public static Map<Long, List<ImgData>> allImagesBySize() {
        throw new UnsupportedOperationException();
    }

    @Data
    static class ImgData {
        private String baseUrl;
        private String locationUrl;
        private Long size;
    }
}
