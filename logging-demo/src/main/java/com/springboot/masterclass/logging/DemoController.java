package com.springboot.masterclass.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam(defaultValue = "World") String name) {
        //MDC.put("UserId", "1234");
        logger.debug("Name : {}", name);
        return Map.of("greeting", " Hello " + name);
    }
}
