package com.lcwd.user.service;

import com.lcwd.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;

public class TestApi {
    public static void main(String[] args) {
        ApiResponse response = ApiResponse.builder()
                .message("Test")
                .success(true)
                .status(HttpStatus.OK)
                .build();
        System.out.println(response.getMessage());
    }
}
