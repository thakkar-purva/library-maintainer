package com.purva.librarymaintainer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "maintainer/api/v1")
public class BookController {

    @GetMapping(value = "/books")
    public void listAllBooks(){

    }
}
