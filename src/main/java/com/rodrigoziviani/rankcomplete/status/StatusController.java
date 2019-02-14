package com.rodrigoziviani.rankcomplete.status;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<Void> status() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
