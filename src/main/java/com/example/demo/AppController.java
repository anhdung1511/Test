package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class AppController {
    Logger log = LogManager.getLogger(getClass());

    @RequestMapping("/")
    public String welcome(@RequestParam("name") String name) {
        log.info("Name: {}", name);
        return String.format("Hello %s, Welcome to Demo", name);
    }
}
