package com.muditasoft.petclinicv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping(value = {"/vets", "/vets/index", "/vets/index.html"})
    public String listOfVets() {
        return "vets/index";
    }
}
