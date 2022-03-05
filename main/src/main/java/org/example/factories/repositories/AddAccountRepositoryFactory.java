package org.example.factories.repositories;

import org.example.protocols.db.linked.AccountLinkedList;
import org.exemple.protocols.db.AddAccountRepository;

public class AddAccountRepositoryFactory {
    
    public static AddAccountRepository makeAddAccountRepository() {
        return AccountLinkedList.getInstance();
    }
}
