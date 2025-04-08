package com.msgroups.ms_formation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("api"))
public class Controller {
    @GetMapping("anything")
    public String anything() {
        return "anything";
    }
}
