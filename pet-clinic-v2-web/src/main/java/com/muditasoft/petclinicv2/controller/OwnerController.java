package com.muditasoft.petclinicv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public String listOfOwners() {
        return "owners/index";
    }
}
