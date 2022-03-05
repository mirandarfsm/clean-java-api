package org.example.protocols.db.linked;

import java.util.LinkedList;
import java.util.List;

import org.exemple.models.Account;
import org.exemple.protocols.db.AddAccountRepository;
import org.exemple.protocols.db.LoadAccountByTokenRepository;

public class AccountLinkedList implements AddAccountRepository, LoadAccountByTokenRepository  {
    
    private static AccountLinkedList instance;

    private List<Account> db;

    private AccountLinkedList() {
        this.db = new LinkedList<>();
    }

    public static synchronized AccountLinkedList getInstance() {
        if(instance == null) {
            instance = new AccountLinkedList();
        }
        return instance;
    }
    
    public Account add(Account account) {
        this.db.add(account);
        return account; 
    }

    public Account load(String token) {
        for (Account account : this.db) {
            if(account.getEmail().equals(token)) {
                return account;
            }
        }
        return new Account();
    }

}
