package com.bobocode.springbootserver.service;

import com.bobocode.springbootserver.controller.dto.Picture;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class MinPictureServiceImpl implements MinPictureService {
    private final RestTemplate restTemplate;

    @Override
    @Cacheable("picture")
    public Picture picture() {
        var photosJsonObject = restTemplate.getForObject(NASA_URL, JsonNode.class);
        return StreamSupport.stream(photosJsonObject.get("photos").spliterator(), true)
                .parallel()
                .map(photo -> photo.get("img_src").asText())
                .map(this::toImgData)
                .min(Comparator.comparing(Picture::getSize))
                .orElseThrow();
    }

    private Picture toImgData(String url) {
        var headers = restTemplate.headForHeaders(url);
        var location = headers.getLocation();
        var sizeHeader = restTemplate.headForHeaders(location);
        return new Picture(url, sizeHeader.getContentLength());
    }

    @Data
    static class ImgData {
        private String url;
        private Long size;
    }
}
