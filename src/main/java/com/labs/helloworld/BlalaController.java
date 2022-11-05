package com.labs.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlalaController {
    @RequestMapping("/blala")
    public String blala() {
        return "Blalalalalalala";
    }
}
