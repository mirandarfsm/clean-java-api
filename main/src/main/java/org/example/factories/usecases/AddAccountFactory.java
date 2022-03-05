package org.example.factories.usecases;

import org.example.factories.repositories.AddAccountRepositoryFactory;
import org.exemple.protocols.db.AddAccountRepository;
import org.exemple.usecases.AddAccount;
import org.exemple.usecases.AddAccountImpl;

public class AddAccountFactory {
    
    public static AddAccount makeAddAccount() {
        return new AddAccountImpl(AddAccountRepositoryFactory.makeAddAccountRepository());
    }

}
