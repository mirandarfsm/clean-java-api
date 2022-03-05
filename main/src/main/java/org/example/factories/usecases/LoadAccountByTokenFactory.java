package org.example.factories.usecases;

import org.example.factories.repositories.LoadAccountByTokenRepositoryFactory;
import org.exemple.usecases.LoadAccountByToken;
import org.exemple.usecases.LoadAccountByTokenImpl;

public class LoadAccountByTokenFactory {
    
    public static LoadAccountByToken makeLoadAccountByToken() {
        return new LoadAccountByTokenImpl(LoadAccountByTokenRepositoryFactory.makeLoadAccountByTokenRepository());
    }

}
