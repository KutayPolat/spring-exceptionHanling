package com.spring.handler.controller;

import com.spring.handler.model.Work;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkController {

    // some work flow can be integrated
    // only for test case
    // no more :)

    @GetMapping
    public ResponseEntity<Work> invoke(){

        // make null pointer
        Work work = new Work();
        work.setField1(null);
        int size = work.getField1().length();

        return new ResponseEntity<>(work, HttpStatus.OK);
    }

}
