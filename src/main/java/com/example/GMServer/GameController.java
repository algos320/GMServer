package com.example.GMServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping(value = "/read")
    public String read() {
        return "1234";
    }
}
