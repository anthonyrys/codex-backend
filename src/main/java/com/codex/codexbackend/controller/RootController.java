package com.codex.codexbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class RootController {

    @GetMapping
    @ResponseBody
    public ResponseEntity<String> root() {
        return ResponseEntity.ok("Success");
    }

}
