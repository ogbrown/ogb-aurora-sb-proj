package com.ogbrown.aurorademo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CredentialsController {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @GetMapping("/credentials")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(Map.of(
                "spring.datasource.username", username,
                "spring.datasource.password", password,
                "spring.datasource.url", url
        ));
    }
}