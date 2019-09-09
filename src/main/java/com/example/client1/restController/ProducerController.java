package com.example.client1.restController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by dely on 2019-09-09
 */

@RestController
public class ProducerController {

    @GetMapping("/pro/con")
    public ResponseEntity proCon2() {
        return ResponseEntity.ok("i`m a Producer named producer2222");
    }

}
