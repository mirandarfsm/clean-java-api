package org.example.controllers;

public interface AccountController {

    Response add(String token);
    Response getByToken(String token);

}
