package org.example.controllers;

import org.exemple.models.Account;
import org.exemple.usecases.AddAccount;
import org.exemple.usecases.LoadAccountByToken;

public class AccountControllerImpl implements AccountController {

    private final AddAccount addAccount;
    private final LoadAccountByToken loadAccountByToken;

    public AccountControllerImpl(AddAccount addAccount, LoadAccountByToken loadAccountByToken) {
        this.addAccount = addAccount;
        this.loadAccountByToken = loadAccountByToken;
    }

    public Response add(String token) {
        if(token == null) {
            return new Response().status(401).body("Token null!");
        }
        Account account = new Account().name(token).email(token).password(token);
        account = this.addAccount.add(account);
        return new Response().status(200).body(account.getName()); 
    }

    public Response getByToken(String token) {
        Account result = this.loadAccountByToken.load(token);
        if(result.getName() != null) {
            return new Response().status(200).body(result.getName()); 
        }
        return new Response().status(401).body("User not Found!");
    }
}
