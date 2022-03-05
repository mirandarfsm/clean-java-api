package org.example.rest;

import org.example.controllers.Response;
import org.example.factories.controllers.AccountControllerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountSpringRest {
    
    @GetMapping("/")
	public ResponseEntity<String> index(@RequestParam String token) {
        Response response = AccountControllerFactory.makeAccountController().getByToken(token);
        return ResponseEntity.status(response.getStatus()).body(response.getBody());
	}

    @GetMapping("/hello")
	public ResponseEntity<String> add(@RequestParam String token) {
        Response response = AccountControllerFactory.makeAccountController().add(token);
        return ResponseEntity.status(response.getStatus()).body(response.getBody());
	}
}
