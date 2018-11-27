package com.ikane.demobackend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Api {

    @GetMapping("")
    public String helloWorld() throws UnknownHostException {

        return "Hello from " + InetAddress.getLocalHost().getHostName();
    }
}
