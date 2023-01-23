package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
@RestController
@RequestMapping(value = "/name")
public class NameController {

    private String name = "Christian";

    @GetMapping
    public String getName(){
        return name;
    }

    @PostMapping
    public String postName() {
        return new StringBuilder(name).reverse().toString();
    }

}
