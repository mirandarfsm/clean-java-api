package org.example.factories.controllers;

import org.example.controllers.AccountController;
import org.example.controllers.AccountControllerImpl;
import org.example.factories.usecases.AddAccountFactory;
import org.example.factories.usecases.LoadAccountByTokenFactory;

public class AccountControllerFactory {

    public static AccountController makeAccountController() {
        return new AccountControllerImpl(AddAccountFactory.makeAddAccount(), LoadAccountByTokenFactory.makeLoadAccountByToken());
    }
}
