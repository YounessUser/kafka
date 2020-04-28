package ma.cdgk.cnss.controllers;

import ma.cdgk.cnss.error.APIErrorException;
import ma.cdgk.cnss.services.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEntityController {

    @Autowired
    private MyService myService;

    @GetMapping("path")
    public ResponseEntity listAll() throws APIErrorException {

        return ResponseEntity.ok(myService.listAll());

    }

}