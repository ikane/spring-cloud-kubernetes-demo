package com.ikane.demofrontend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.UnknownHostException;

@RestController
public class Api {

    @GetMapping
    public String helloWorld() throws UnknownHostException {

        RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "http://demo-backend:8080";
        ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);
        return "Message from backend is: " + response.getBody();
    }
}
