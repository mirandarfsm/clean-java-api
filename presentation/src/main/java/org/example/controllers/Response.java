package org.example.controllers;

public class Response {
    
    private int status;
    private String body;

    public int getStatus() {
        return status;
    }

    public Response status(int status) {
        this.status = status;
        return this;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBody() {
        return body;
    }

    public Response body(String body) {
        this.body = body;
        return this;
    }

    public void setBody(String body) {
        this.body = body;
    }

    
}
