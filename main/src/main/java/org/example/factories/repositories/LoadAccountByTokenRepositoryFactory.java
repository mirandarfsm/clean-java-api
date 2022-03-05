package org.example.factories.repositories;

import org.example.protocols.db.linked.AccountLinkedList;
import org.exemple.protocols.db.LoadAccountByTokenRepository;

public class LoadAccountByTokenRepositoryFactory {
    
    public static LoadAccountByTokenRepository makeLoadAccountByTokenRepository() {
        return  AccountLinkedList.getInstance();
    }
}
