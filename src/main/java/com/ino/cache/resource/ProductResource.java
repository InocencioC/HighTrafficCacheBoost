package com.ino.cache.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @GetMapping("/")
    public String listAll() {
        return "produtos";
    }


}
