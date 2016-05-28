package org.aaron.spring.boot.example.controller;

import org.aaron.spring.boot.example.model.MyServiceResponse;
import org.aaron.spring.boot.example.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("my_service/v1")
public class MyServiceRestController {

    private static final Logger LOG = LoggerFactory.getLogger(MyServiceRestController.class);

    @Autowired
    MyService myService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyServiceResponse> getDataByID(
            @RequestHeader HttpHeaders headers,
            @PathVariable("id") String id) {
        return ResponseEntity.ok(myService.getServiceResponse(id));
    }
}
